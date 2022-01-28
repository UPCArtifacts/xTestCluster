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
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        int int9 = node8.getChangeTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node8.getChildAtIndex(55);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "", 0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex(10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        com.google.javascript.rhino.Node node20 = node19.cloneNode();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        boolean boolean30 = node20.hasChild(node24);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node39 = node34.copyInformationFrom(node38);
        int int40 = node39.getChangeTime();
        boolean boolean41 = node39.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        boolean boolean46 = node39.hasChild(node45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node20.removeChild(node45);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        int int9 = node8.getChangeTime();
        boolean boolean10 = node8.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node23 = node18.copyInformationFrom(node22);
        node23.addSuppression("hi!");
        boolean boolean26 = node14.isEquivalentTo(node23);
        boolean boolean27 = node14.isCase();
        boolean boolean28 = node14.isCast();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node14.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.removeChild(node14);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        node8.addSuppression("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        node8.setDirectives((java.util.Set<java.lang.String>) strSet13);
        boolean boolean17 = node8.getBooleanProp((int) '4');
        boolean boolean18 = node8.isGetElem();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node27 = node22.copyInformationFrom(node26);
        boolean boolean28 = node27.isAssignAdd();
        boolean boolean29 = node27.isTrue();
        boolean boolean30 = node27.wasEmptyNode();
        boolean boolean31 = node27.isCatch();
        boolean boolean32 = node27.isDebugger();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node41 = node36.copyInformationFrom(node40);
        int int42 = node41.getSourcePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.replaceChild(node27, node41);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        int int9 = node8.getChangeTime();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        boolean boolean20 = node19.isAssignAdd();
        boolean boolean21 = node19.isGetProp();
        java.lang.String str22 = node19.toStringTree();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node35 = node30.copyInformationFrom(node34);
        node35.addSuppression("hi!");
        boolean boolean38 = node26.isEquivalentTo(node35);
        node26.setDouble(1.0d);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node49 = node44.copyInformationFrom(node48);
        int int50 = node49.getChangeTime();
        boolean boolean51 = node49.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node60 = node55.copyInformationFrom(node59);
        int int61 = node60.getChangeTime();
        boolean boolean62 = node60.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(100, node19, node26, node49, node60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node64 = node8.getChildBefore(node26);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        com.google.javascript.rhino.Node node20 = node19.cloneNode();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        boolean boolean30 = node20.hasChild(node24);
        node20.setOptionalArg(false);
        boolean boolean33 = node20.isFromExterns();
        node20.setDouble((double) 4);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node40 = node39.cloneTree();
        boolean boolean41 = node39.isAssignAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node20.removeChild(node39);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        boolean boolean20 = node19.isScript();
        java.lang.String str24 = node19.toString(true, false, false);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node33 = node28.copyInformationFrom(node32);
        boolean boolean34 = node33.isAssignAdd();
        boolean boolean36 = node33.getBooleanProp(55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node19.getChildBefore(node33);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        int int9 = node8.getChangeTime();
        node8.setVarArgs(true);
        node8.setType(51);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node22 = node17.copyInformationFrom(node21);
        boolean boolean23 = node22.isAssignAdd();
        boolean boolean24 = node22.isTrue();
        boolean boolean25 = node22.wasEmptyNode();
        boolean boolean26 = node22.isStringKey();
        boolean boolean27 = node22.isTypeOf();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node36 = node31.copyInformationFrom(node35);
        int int37 = node36.getChangeTime();
        boolean boolean38 = node36.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        boolean boolean43 = node36.hasChild(node42);
        com.google.javascript.rhino.Node node44 = node22.clonePropsFrom(node42);
        com.google.javascript.rhino.Node node45 = node8.srcrefTree(node22);
        boolean boolean46 = node45.hasOneChild();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node45.children();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node60 = node55.copyInformationFrom(node59);
        node60.addSuppression("hi!");
        boolean boolean63 = node51.isEquivalentTo(node60);
        boolean boolean64 = node51.isNot();
        boolean boolean65 = node51.isOptionalArg();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node45.removeChild(node51);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        boolean boolean16 = node12.isGetterDef();
        node12.setType((int) '#');
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node31 = node26.copyInformationFrom(node30);
        node31.addSuppression("hi!");
        boolean boolean34 = node22.isEquivalentTo(node31);
        boolean boolean35 = node22.isCase();
        boolean boolean36 = node22.isCast();
        com.google.javascript.rhino.Node node37 = node12.useSourceInfoIfMissingFrom(node22);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node46 = node41.copyInformationFrom(node45);
        com.google.javascript.rhino.Node node47 = node46.getLastSibling();
        java.lang.String str48 = node46.getSourceFileName();
        boolean boolean49 = node46.isCall();
        java.lang.String str50 = node12.checkTreeEquals(node46);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node63 = node58.copyInformationFrom(node62);
        node63.addSuppression("hi!");
        boolean boolean66 = node54.isEquivalentTo(node63);
        node54.setDouble(1.0d);
        boolean boolean69 = node54.isSwitch();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node78 = node73.copyInformationFrom(node77);
        boolean boolean79 = node78.isAssignAdd();
        boolean boolean80 = node78.isFromExterns();
        boolean boolean81 = node78.isVarArgs();
        boolean boolean82 = node78.isDebugger();
        int int83 = node54.getIndexOfChild(node78);
        node54.setLength((-1));
        com.google.javascript.rhino.Node node86 = node46.srcrefTree(node54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node88 = node54.getChildAtIndex(40);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0, (int) (short) 100, 15);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        boolean boolean13 = node11.isStringKey();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node22 = node17.copyInformationFrom(node21);
        com.google.javascript.rhino.Node node23 = node11.srcrefTree(node22);
        com.google.javascript.rhino.Node node24 = node23.cloneNode();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node33 = node28.copyInformationFrom(node32);
        boolean boolean34 = node24.hasChild(node28);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        boolean boolean44 = node42.isStringKey();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node53 = node48.copyInformationFrom(node52);
        com.google.javascript.rhino.Node node54 = node42.srcrefTree(node53);
        boolean boolean55 = node54.isVarArgs();
        int int56 = node54.getSideEffectFlags();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node65 = node60.copyInformationFrom(node64);
        com.google.javascript.rhino.Node node66 = node65.getLastSibling();
        boolean boolean67 = node65.isBreak();
        com.google.javascript.rhino.Node node68 = node54.srcrefTree(node65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node24, node54);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        node8.addSuppression("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        node8.setDirectives((java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = node8.isCase();
        node8.detachChildren();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = node25.copyInformationFrom(node29);
        boolean boolean31 = node29.isStringKey();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node40 = node35.copyInformationFrom(node39);
        com.google.javascript.rhino.Node node41 = node29.srcrefTree(node40);
        boolean boolean42 = node41.isScript();
        boolean boolean43 = node41.isBreak();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        node41.addChildToFront(node47);
        com.google.javascript.rhino.Node node49 = node21.copyInformationFrom(node47);
        boolean boolean50 = node49.isSyntheticBlock();
        com.google.javascript.rhino.Node node51 = node8.copyInformationFrom(node49);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(10.0d);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("", 1, 100);
        boolean boolean58 = node57.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node49.replaceChild(node53, node57);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        node8.addSuppression("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        node8.setDirectives((java.util.Set<java.lang.String>) strSet13);
        boolean boolean17 = node8.getBooleanProp((int) '4');
        boolean boolean18 = node8.isGetElem();
        boolean boolean19 = node8.isBlock();
        boolean boolean20 = node8.isFalse();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node8.getChildAtIndex((int) (short) 10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, (int) (byte) 1, (-1));
        boolean boolean4 = node3.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex(40);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        com.google.javascript.rhino.Node node20 = node19.cloneNode();
        boolean boolean21 = node19.isLabelName();
        boolean boolean22 = node19.isName();
        boolean boolean23 = node19.isVarArgs();
        boolean boolean24 = node19.isCase();
        boolean boolean25 = node19.isVar();
        boolean boolean26 = node19.isDo();
        node19.setDouble(0.0d);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node37 = node32.copyInformationFrom(node36);
        int int38 = node37.getChangeTime();
        node37.setVarArgs(true);
        node37.setType(51);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node37.siblings();
        node37.addSuppression("NUMBER 0.0 [direct_eval: 52]");
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = node49.copyInformationFrom(node53);
        boolean boolean55 = node53.isStringKey();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node64 = node59.copyInformationFrom(node63);
        com.google.javascript.rhino.Node node65 = node53.srcrefTree(node64);
        boolean boolean66 = node65.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node19.replaceChild(node37, node65);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node8.isAssignAdd();
        java.lang.String[] strArray13 = new java.lang.String[] { "NUMBER 0.0 [var_args_name: 1]", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        node8.setDirectives((java.util.Set<java.lang.String>) strSet14);
        int int17 = node8.getLineno();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = node25.copyInformationFrom(node29);
        node30.addSuppression("hi!");
        boolean boolean33 = node21.isEquivalentTo(node30);
        boolean boolean34 = node21.isCase();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node44 = node39.copyInformationFrom(node43);
        boolean boolean45 = node43.isStringKey();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = node49.copyInformationFrom(node53);
        com.google.javascript.rhino.Node node55 = node43.srcrefTree(node54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node64 = node59.copyInformationFrom(node63);
        boolean boolean65 = node63.isStringKey();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node78 = node73.copyInformationFrom(node77);
        node78.addSuppression("hi!");
        boolean boolean81 = node69.isEquivalentTo(node78);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node90 = node85.copyInformationFrom(node89);
        com.google.javascript.rhino.Node[] nodeArray91 = new com.google.javascript.rhino.Node[] { node54, node63, node78, node89 };
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node((int) '#', nodeArray91);
        boolean boolean93 = node92.isLocalResultCall();
        com.google.javascript.rhino.Node node94 = node21.srcref(node92);
        boolean boolean95 = node21.isStringKey();
        com.google.javascript.rhino.Node node97 = com.google.javascript.rhino.Node.newString("NUMBER 0.0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.replaceChild(node21, node97);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        boolean boolean16 = node12.isGetterDef();
        node12.setType((int) '#');
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node31 = node26.copyInformationFrom(node30);
        node31.addSuppression("hi!");
        boolean boolean34 = node22.isEquivalentTo(node31);
        boolean boolean35 = node22.isCase();
        boolean boolean36 = node22.isCast();
        com.google.javascript.rhino.Node node37 = node12.useSourceInfoIfMissingFrom(node22);
        boolean boolean38 = node37.isString();
        node37.setChangeTime((int) (short) 1);
        java.lang.String str41 = node37.toStringTree();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node51 = node46.copyInformationFrom(node50);
        com.google.javascript.rhino.Node node52 = node51.getLastSibling();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(100, node51);
        int int54 = node51.getLength();
        boolean boolean55 = node51.isOptionalArg();
        node51.setLength(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node58 = node37.getChildBefore(node51);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        boolean boolean20 = node19.isScript();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = node19.getStaticSourceFile();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node19.siblings();
        java.lang.String str24 = node19.toString();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 1, 100);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable29 = node28.getAncestors();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 [var_args_name: 1]", 56, 0);
        int int34 = node33.getChildCount();
        boolean boolean35 = node33.isIn();
        boolean boolean36 = node33.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node19.replaceChild(node28, node33);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node8.isAssignAdd();
        int int10 = node8.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        boolean boolean20 = node18.isStringKey();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        com.google.javascript.rhino.Node node30 = node18.srcrefTree(node29);
        boolean boolean31 = node29.isCatch();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node40 = node35.copyInformationFrom(node39);
        int int41 = node40.getChangeTime();
        boolean boolean42 = node40.hasMoreThanOneChild();
        java.lang.String str43 = node29.checkTreeEquals(node40);
        com.google.javascript.rhino.jstype.JSType jSType44 = node29.getJSType();
        boolean boolean45 = node29.isCase();
        int int46 = node29.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.removeChild(node29);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        boolean boolean13 = node11.isStringKey();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node22 = node17.copyInformationFrom(node21);
        com.google.javascript.rhino.Node node23 = node11.srcrefTree(node22);
        boolean boolean24 = node23.isScript();
        boolean boolean25 = node23.isBreak();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        node23.addChildToFront(node29);
        com.google.javascript.rhino.Node node31 = node3.copyInformationFrom(node29);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder32 = node3.new FileLevelJsDocBuilder();
        boolean boolean33 = node3.isWhile();
        java.lang.String str34 = node3.getSourceFileName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node36 = node3.getChildAtIndex(36);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("NUMBER 0.0\n", (int) (byte) 10, (int) (short) 10);
        boolean boolean4 = node3.isNot();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node14 = node9.copyInformationFrom(node13);
        boolean boolean15 = node13.isStringKey();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node24 = node19.copyInformationFrom(node23);
        com.google.javascript.rhino.Node node25 = node13.srcrefTree(node24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node34 = node29.copyInformationFrom(node33);
        boolean boolean35 = node33.isStringKey();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node48 = node43.copyInformationFrom(node47);
        node48.addSuppression("hi!");
        boolean boolean51 = node39.isEquivalentTo(node48);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node60 = node55.copyInformationFrom(node59);
        com.google.javascript.rhino.Node[] nodeArray61 = new com.google.javascript.rhino.Node[] { node24, node33, node48, node59 };
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) '#', nodeArray61);
        boolean boolean63 = node62.isCall();
        int int64 = node62.getSourcePosition();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node73 = node68.copyInformationFrom(node72);
        boolean boolean74 = node72.isStringKey();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node83 = node78.copyInformationFrom(node82);
        com.google.javascript.rhino.Node node84 = node72.srcrefTree(node83);
        node84.detachChildren();
        double double86 = node84.getDouble();
        com.google.javascript.rhino.Node node87 = node62.srcref(node84);
        boolean boolean88 = node87.wasEmptyNode();
        node87.putBooleanProp(55, true);
        boolean boolean92 = node87.isCatch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node87);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node8.isAssignAdd();
        boolean boolean10 = node8.isGetProp();
        boolean boolean11 = node8.isArrayLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node24 = node19.copyInformationFrom(node23);
        node24.addSuppression("hi!");
        boolean boolean27 = node15.isEquivalentTo(node24);
        boolean boolean28 = node24.isGetterDef();
        node24.setType((int) '#');
        node8.addChildToFront(node24);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node8.siblings();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node8.siblings();
        int int34 = node8.getSourcePosition();
        boolean boolean35 = node8.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node8.getChildAtIndex(4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 47, 48, (int) '4');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 51, 36, (int) (short) 10);
        boolean boolean8 = node7.isTry();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = node12.copyInformationFrom(node16);
        int int18 = node17.getChangeTime();
        node17.setVarArgs(true);
        node17.setType(51);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node31 = node26.copyInformationFrom(node30);
        boolean boolean32 = node31.isAssignAdd();
        boolean boolean33 = node31.isTrue();
        boolean boolean34 = node31.wasEmptyNode();
        boolean boolean35 = node31.isStringKey();
        boolean boolean36 = node31.isTypeOf();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node45 = node40.copyInformationFrom(node44);
        int int46 = node45.getChangeTime();
        boolean boolean47 = node45.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        boolean boolean52 = node45.hasChild(node51);
        com.google.javascript.rhino.Node node53 = node31.clonePropsFrom(node51);
        com.google.javascript.rhino.Node node54 = node17.srcrefTree(node31);
        node7.addChildToFront(node17);
        boolean boolean56 = node7.isWhile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node3.getChildBefore(node7);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        int int9 = node8.getChangeTime();
        node8.setVarArgs(true);
        node8.setType(51);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node22 = node17.copyInformationFrom(node21);
        boolean boolean23 = node22.isAssignAdd();
        boolean boolean24 = node22.isTrue();
        boolean boolean25 = node22.wasEmptyNode();
        boolean boolean26 = node22.isStringKey();
        boolean boolean27 = node22.isTypeOf();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node36 = node31.copyInformationFrom(node35);
        int int37 = node36.getChangeTime();
        boolean boolean38 = node36.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        boolean boolean43 = node36.hasChild(node42);
        com.google.javascript.rhino.Node node44 = node22.clonePropsFrom(node42);
        com.google.javascript.rhino.Node node45 = node8.srcrefTree(node22);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node58 = node53.copyInformationFrom(node57);
        node58.addSuppression("hi!");
        boolean boolean61 = node49.isEquivalentTo(node58);
        boolean boolean62 = node58.isGetterDef();
        node58.setType((int) '#');
        boolean boolean65 = node58.isVar();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node74 = node69.copyInformationFrom(node73);
        boolean boolean75 = node73.isStringKey();
        boolean boolean76 = node73.isThrow();
        com.google.javascript.rhino.Node node77 = node73.getParent();
        node58.addChildToBack(node73);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder79 = node73.getJsDocBuilderForNode();
        node73.setSourceEncodedPositionForTree((int) (byte) 100);
        boolean boolean82 = node73.isExprResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node22.removeChild(node73);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 [var_args_name: 1]", 56, 0);
        int int4 = node3.getChildCount();
        boolean boolean5 = node3.isIn();
        int int6 = node3.getLineno();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 100L);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) '4', "", 15, 4);
        com.google.javascript.rhino.Node node14 = node8.useSourceInfoIfMissingFromForTree(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node23 = node18.copyInformationFrom(node22);
        boolean boolean24 = node23.isAssignAdd();
        boolean boolean25 = node23.isFromExterns();
        boolean boolean26 = node23.isVarArgs();
        node23.setSourceFileForTesting("NUMBER 0.0");
        com.google.javascript.rhino.Node node29 = node14.useSourceInfoIfMissingFrom(node23);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = node23.getStaticSourceFile();
        node3.setStaticSourceFile(staticSourceFile30);
        boolean boolean32 = node3.isNumber();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node41 = node36.copyInformationFrom(node40);
        boolean boolean42 = node40.isStringKey();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node51 = node46.copyInformationFrom(node50);
        com.google.javascript.rhino.Node node52 = node40.srcrefTree(node51);
        node52.detachChildren();
        double double54 = node52.getDouble();
        boolean boolean55 = node52.isWhile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node52);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        com.google.javascript.rhino.Node node10 = node9.getLastSibling();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(100, node9);
        com.google.javascript.rhino.Node node12 = node11.removeFirstChild();
        java.lang.Object obj14 = node11.getProp(55);
        boolean boolean15 = node11.isIn();
        node11.addSuppression("NUMBER 0.0\n    NUMBER 0.0\n");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node26 = node21.copyInformationFrom(node25);
        boolean boolean27 = node26.isAssignAdd();
        boolean boolean28 = node26.isTrue();
        boolean boolean29 = node26.isInstanceOf();
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isGetterDef();
        boolean boolean32 = node26.isUnscopedQualifiedName();
        int int33 = node26.getSourceOffset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.removeChild(node26);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node8.isAssignAdd();
        int int10 = node8.getCharno();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node15 = node14.cloneTree();
        boolean boolean16 = node14.isFunction();
        boolean boolean17 = node14.isRegExp();
        node8.addChildToBack(node14);
        java.lang.String str19 = node14.getSourceFileName();
        boolean boolean20 = node14.isWith();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 409638, (int) (byte) -1, 47);
        boolean boolean25 = node24.isLabel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node14.getChildBefore(node24);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        boolean boolean16 = node3.isCase();
        boolean boolean17 = node3.isCast();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node3.siblings();
        boolean boolean19 = node3.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node3.getChildAtIndex(46);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        boolean boolean16 = node3.isDelProp();
        boolean boolean17 = node3.isDo();
        java.lang.Object obj19 = node3.getProp(55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node3.getChildAtIndex(29);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        boolean boolean16 = node12.isGetterDef();
        node12.setType((int) '#');
        boolean boolean19 = node12.isVar();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = node23.copyInformationFrom(node27);
        boolean boolean29 = node28.isAssignAdd();
        boolean boolean30 = node28.isTrue();
        boolean boolean31 = node28.wasEmptyNode();
        int int32 = node12.getIndexOfChild(node28);
        node12.setSourceEncodedPosition(43);
        boolean boolean35 = node12.isIf();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node40 = node39.cloneTree();
        boolean boolean41 = node39.isFunction();
        boolean boolean42 = node39.isRegExp();
        boolean boolean43 = node39.isFunction();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node52 = node47.copyInformationFrom(node51);
        boolean boolean53 = node52.isAssignAdd();
        boolean boolean54 = node52.isGetProp();
        boolean boolean55 = node52.isArrayLit();
        com.google.javascript.rhino.Node node56 = node39.useSourceInfoIfMissingFrom(node52);
        boolean boolean57 = node39.isScript();
        com.google.javascript.rhino.Node node58 = node39.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node12.getChildBefore(node39);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) '#', (int) '#', 39);
        boolean boolean4 = node3.isOr();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = node12.copyInformationFrom(node16);
        node17.addSuppression("hi!");
        boolean boolean20 = node8.isEquivalentTo(node17);
        boolean boolean21 = node17.isGetterDef();
        node17.setType((int) '#');
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node36 = node31.copyInformationFrom(node35);
        node36.addSuppression("hi!");
        boolean boolean39 = node27.isEquivalentTo(node36);
        boolean boolean40 = node27.isCase();
        boolean boolean41 = node27.isCast();
        com.google.javascript.rhino.Node node42 = node17.useSourceInfoIfMissingFrom(node27);
        boolean boolean43 = node42.isString();
        node42.setChangeTime((int) (short) 1);
        boolean boolean46 = node42.isDefaultCase();
        boolean boolean47 = node42.isSetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node42);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        boolean boolean20 = node19.isScript();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = node19.getStaticSourceFile();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node19.siblings();
        java.lang.String str24 = node19.toString();
        boolean boolean25 = node19.isIf();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node34 = node29.copyInformationFrom(node33);
        boolean boolean35 = node33.isStringKey();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node44 = node39.copyInformationFrom(node43);
        com.google.javascript.rhino.Node node45 = node33.srcrefTree(node44);
        com.google.javascript.rhino.Node node46 = node45.cloneNode();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = node50.copyInformationFrom(node54);
        boolean boolean56 = node46.hasChild(node50);
        int int57 = node50.getSourceOffset();
        boolean boolean58 = node50.isNoSideEffectsCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node19.getChildBefore(node50);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        boolean boolean16 = node12.isGetterDef();
        node12.setType((int) '#');
        boolean boolean19 = node12.isVar();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = node23.copyInformationFrom(node27);
        boolean boolean29 = node27.isStringKey();
        boolean boolean30 = node27.isThrow();
        com.google.javascript.rhino.Node node31 = node27.getParent();
        node12.addChildToBack(node27);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder33 = node27.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node46 = node41.copyInformationFrom(node45);
        node46.addSuppression("hi!");
        boolean boolean49 = node37.isEquivalentTo(node46);
        boolean boolean50 = node46.isGetterDef();
        node46.setType((int) '#');
        boolean boolean53 = node46.isVar();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node62 = node57.copyInformationFrom(node61);
        boolean boolean63 = node62.isAssignAdd();
        boolean boolean64 = node62.isTrue();
        boolean boolean65 = node62.wasEmptyNode();
        int int66 = node46.getIndexOfChild(node62);
        com.google.javascript.rhino.Node node67 = node46.getFirstChild();
        int int68 = node46.getChangeTime();
        node27.addChildToFront(node46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node27.getChildAtIndex(37);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node8.isStringKey();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node19);
        com.google.javascript.rhino.Node node21 = node20.cloneNode();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = node25.copyInformationFrom(node29);
        int int31 = node30.getChangeTime();
        boolean boolean32 = node30.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        boolean boolean37 = node30.hasChild(node36);
        boolean boolean38 = node30.isQualifiedName();
        boolean boolean39 = node30.isFalse();
        boolean boolean40 = node30.isAnd();
        com.google.javascript.rhino.Node node41 = node20.useSourceInfoFrom(node30);
        com.google.javascript.rhino.Node node42 = node41.removeFirstChild();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) -1, node41, 1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = node45.getChildAtIndex(409638);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("NUMBER 0.0", (int) (byte) -1, (int) (byte) 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        int int13 = node12.getChangeTime();
        boolean boolean14 = node12.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        boolean boolean19 = node12.hasChild(node18);
        java.lang.String str20 = node18.getQualifiedName();
        boolean boolean21 = node18.isNumber();
        boolean boolean22 = node18.isIn();
        node3.addChildToFront(node18);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node33 = node28.copyInformationFrom(node32);
        boolean boolean34 = node32.isStringKey();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        com.google.javascript.rhino.Node node44 = node32.srcrefTree(node43);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node53 = node48.copyInformationFrom(node52);
        boolean boolean54 = node52.isStringKey();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node67 = node62.copyInformationFrom(node66);
        node67.addSuppression("hi!");
        boolean boolean70 = node58.isEquivalentTo(node67);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node79 = node74.copyInformationFrom(node78);
        com.google.javascript.rhino.Node[] nodeArray80 = new com.google.javascript.rhino.Node[] { node43, node52, node67, node78 };
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) '#', nodeArray80);
        boolean boolean82 = node81.isCall();
        int int83 = node81.getSourcePosition();
        boolean boolean84 = node81.isNE();
        boolean boolean85 = node81.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node18.removeChild(node81);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        boolean boolean20 = node19.isScript();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = node25.copyInformationFrom(node29);
        boolean boolean31 = node29.isStringKey();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node40 = node35.copyInformationFrom(node39);
        com.google.javascript.rhino.Node node41 = node29.srcrefTree(node40);
        boolean boolean42 = node41.isScript();
        com.google.javascript.rhino.Node node43 = node19.useSourceInfoFrom(node41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node45 = node41.getChildAtIndex(35);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 [var_args_name: 1]");
        boolean boolean2 = node1.isUnscopedQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = node1.getChildAtIndex(409638);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "", 0, (int) (short) 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("GETELEM [jsdoc_info: JSDocInfo]\n", 0, 100);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = node12.copyInformationFrom(node16);
        boolean boolean18 = node16.isStringKey();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node27 = node22.copyInformationFrom(node26);
        com.google.javascript.rhino.Node node28 = node16.srcrefTree(node27);
        boolean boolean29 = node27.isCatch();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = node37.copyInformationFrom(node41);
        node42.addSuppression("hi!");
        boolean boolean45 = node33.isEquivalentTo(node42);
        boolean boolean46 = node33.isCase();
        boolean boolean47 = node33.isCast();
        com.google.javascript.rhino.Node node48 = node27.srcrefTree(node33);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable49 = node33.getAncestors();
        boolean boolean50 = node33.isLabelName();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node59 = node54.copyInformationFrom(node58);
        boolean boolean60 = node33.hasChild(node59);
        boolean boolean61 = node33.isArrayLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node8, node33);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        com.google.javascript.rhino.Node node20 = node19.cloneNode();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        boolean boolean30 = node20.hasChild(node24);
        java.util.Set<java.lang.String> strSet31 = node20.getDirectives();
        boolean boolean32 = node20.isFromExterns();
        boolean boolean33 = node20.isBlock();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node39 = node38.cloneTree();
        boolean boolean40 = node38.isFunction();
        boolean boolean41 = node38.isRegExp();
        boolean boolean42 = node38.isFunction();
        node20.putProp((int) 'a', (java.lang.Object) node38);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node53 = node48.copyInformationFrom(node52);
        int int54 = node53.getChangeTime();
        node53.setVarArgs(true);
        node53.setType(51);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node53.siblings();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(37, node53, 46, (int) (short) -1);
        boolean boolean63 = node53.isQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node64 = node38.getChildBefore(node53);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(409638, nodeArray4, (int) (byte) 0, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) 'a', nodeArray4);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(409638, nodeArray4, 42, 15);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(56, nodeArray4);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node17 = node16.cloneTree();
        node17.putBooleanProp(31, true);
        node17.setLength(4196);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node31 = node26.copyInformationFrom(node30);
        boolean boolean32 = node31.isAssignAdd();
        boolean boolean33 = node31.isGetProp();
        node31.setOptionalArg(false);
        boolean boolean36 = node31.isThrow();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.replaceChild(node17, node31);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node8.isAssignAdd();
        boolean boolean10 = node8.isGetProp();
        boolean boolean11 = node8.isArrayLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node24 = node19.copyInformationFrom(node23);
        node24.addSuppression("hi!");
        boolean boolean27 = node15.isEquivalentTo(node24);
        boolean boolean28 = node24.isGetterDef();
        node24.setType((int) '#');
        node8.addChildToFront(node24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node33 = node8.getChildAtIndex(52);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 100, 4095, 409638);
        boolean boolean4 = node3.isLocalResultCall();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node13 = node8.copyInformationFrom(node12);
        boolean boolean14 = node12.isStringKey();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node23 = node18.copyInformationFrom(node22);
        com.google.javascript.rhino.Node node24 = node12.srcrefTree(node23);
        boolean boolean25 = node24.isScript();
        boolean boolean26 = node24.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node24.getStaticSourceFile();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, 38);
        int int32 = node31.getSourcePosition();
        boolean boolean33 = node31.isWith();
        boolean boolean34 = node31.isCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node24, node31);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(409638, nodeArray8, (int) (byte) 0, (int) (short) -1);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) 'a', nodeArray8);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0, nodeArray8);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0, nodeArray8, 12, 36);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(43, nodeArray8);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, nodeArray8, (-1), 12);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) 1, nodeArray8);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray8);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(39, 40, (int) '#');
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node35 = node30.copyInformationFrom(node34);
        com.google.javascript.rhino.Node node36 = node35.getLastSibling();
        boolean boolean37 = node36.isInstanceOf();
        int int38 = node36.getType();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), 10, 30);
        com.google.javascript.rhino.Node node43 = node36.useSourceInfoFrom(node42);
        node26.addChildrenToBack(node42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node45 = node22.getChildBefore(node42);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, 38);
        int int4 = node3.getSourcePosition();
        boolean boolean5 = node3.isWith();
        boolean boolean6 = node3.isAdd();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node15 = node10.copyInformationFrom(node14);
        boolean boolean16 = node14.isStringKey();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node25 = node20.copyInformationFrom(node24);
        com.google.javascript.rhino.Node node26 = node14.srcrefTree(node25);
        com.google.javascript.rhino.Node node27 = node26.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node36 = node31.copyInformationFrom(node35);
        boolean boolean37 = node27.hasChild(node31);
        java.util.Set<java.lang.String> strSet38 = node27.getDirectives();
        boolean boolean39 = node27.isFromExterns();
        boolean boolean40 = node27.isBlock();
        boolean boolean41 = node27.isTry();
        node27.setOptionalArg(true);
        boolean boolean44 = node27.isAssignAdd();
        java.lang.String[] strArray59 = new java.lang.String[] { "Node tree inequality:\nTree1:\nNUMBER 0.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nERROR hi!\n\n\nSubtree1: NUMBER 0.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: ERROR hi!\n", "GETELEM", "Node tree inequality:\nTree1:\nGETELEM [jsdoc_info: JSDocInfo]\n\n\nTree2:\nNUMBER 0.0\n\n\nSubtree1: GETELEM [jsdoc_info: JSDocInfo]\n\n\nSubtree2: NUMBER 0.0\n", "GETELEM", "Node tree inequality:\nTree1:\nNUMBER 0.0\n    NUMBER 0.0\n\n\nTree2:\nBITXOR 31\n    NUMBER 0.0 [directives: [NUMBER 0.0 [var_args_name: 1], hi!, ]]\n\n\nSubtree1: NUMBER 0.0\n    NUMBER 0.0\n\n\nSubtree2: BITXOR 31\n    NUMBER 0.0 [directives: [NUMBER 0.0 [var_args_name: 1], hi!, ]]\n", "GETELEM [jsdoc_info: JSDocInfo]\n", "BITXOR", "NUMBER 0.0\n", "Node tree inequality:\nTree1:\nGETELEM [jsdoc_info: JSDocInfo]\n\n\nTree2:\nNUMBER 0.0\n\n\nSubtree1: GETELEM [jsdoc_info: JSDocInfo]\n\n\nSubtree2: NUMBER 0.0\n", "Node tree inequality:\nTree1:\nNUMBER 0.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nERROR hi!\n\n\nSubtree1: NUMBER 0.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: ERROR hi!\n", "hi!", "BITXOR", "NUMBER 0.0 [direct_eval: 52]", "GETELEM [jsdoc_info: JSDocInfo]\n" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        node27.setDirectives((java.util.Set<java.lang.String>) strSet60);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet60);
        boolean boolean64 = node3.isExprResult();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node73 = node68.copyInformationFrom(node72);
        boolean boolean74 = node73.isAssignAdd();
        boolean boolean75 = node73.isTrue();
        boolean boolean76 = node73.wasEmptyNode();
        boolean boolean77 = node73.isStringKey();
        com.google.javascript.rhino.Node node78 = node73.getParent();
        boolean boolean79 = node73.isReturn();
        com.google.javascript.rhino.Node node80 = node73.getLastSibling();
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(39, 40, (int) '#');
        com.google.javascript.rhino.Node node85 = node73.srcrefTree(node84);
        int int86 = node73.getType();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable87 = node73.children();
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newString("NUMBER 0.0", 4095, 30);
        com.google.javascript.rhino.Node node92 = node91.getLastChild();
        boolean boolean94 = node91.getBooleanProp(35);
        int int95 = node91.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node73, node91);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        com.google.javascript.rhino.Node node9 = node8.getLastSibling();
        java.lang.String str13 = node9.toString(false, false, false);
        com.google.javascript.rhino.Node node14 = node9.getLastChild();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node27 = node22.copyInformationFrom(node26);
        node27.addSuppression("hi!");
        boolean boolean30 = node18.isEquivalentTo(node27);
        boolean boolean31 = node18.isDelProp();
        com.google.javascript.rhino.InputId inputId32 = node18.getInputId();
        int int33 = node9.getIndexOfChild(node18);
        boolean boolean34 = node9.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.removeChild(node36);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        boolean boolean16 = node12.isGetterDef();
        node12.setType((int) '#');
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node31 = node26.copyInformationFrom(node30);
        node31.addSuppression("hi!");
        boolean boolean34 = node22.isEquivalentTo(node31);
        boolean boolean35 = node22.isCase();
        boolean boolean36 = node22.isCast();
        com.google.javascript.rhino.Node node37 = node12.useSourceInfoIfMissingFrom(node22);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        boolean boolean39 = node37.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node37.getChildAtIndex(15);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        boolean boolean20 = node19.isScript();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = node25.copyInformationFrom(node29);
        boolean boolean31 = node29.isStringKey();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node40 = node35.copyInformationFrom(node39);
        com.google.javascript.rhino.Node node41 = node29.srcrefTree(node40);
        boolean boolean42 = node41.isScript();
        com.google.javascript.rhino.Node node43 = node19.useSourceInfoFrom(node41);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node52 = node47.copyInformationFrom(node51);
        boolean boolean53 = node51.isStringKey();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node62 = node57.copyInformationFrom(node61);
        com.google.javascript.rhino.Node node63 = node51.srcrefTree(node62);
        boolean boolean64 = node62.isCatch();
        boolean boolean65 = node43.isEquivalentToTyped(node62);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node74 = node69.copyInformationFrom(node73);
        boolean boolean75 = node74.isAssignAdd();
        java.lang.String[] strArray79 = new java.lang.String[] { "NUMBER 0.0 [var_args_name: 1]", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        node74.setDirectives((java.util.Set<java.lang.String>) strSet80);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nGETELEM [jsdoc_info: JSDocInfo]\n\n\nTree2:\nNUMBER 0.0\n\n\nSubtree1: GETELEM [jsdoc_info: JSDocInfo]\n\n\nSubtree2: NUMBER 0.0\n", (int) ' ', (int) (byte) 1);
        boolean boolean87 = node74.isEquivalentToTyped(node86);
        int int88 = node86.getChildCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node89 = node43.getChildBefore(node86);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        node8.addSuppression("hi!");
        boolean boolean11 = node8.isThrow();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node8.children();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node25 = node20.copyInformationFrom(node24);
        boolean boolean26 = node24.isStringKey();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node35 = node30.copyInformationFrom(node34);
        com.google.javascript.rhino.Node node36 = node24.srcrefTree(node35);
        boolean boolean37 = node36.isScript();
        boolean boolean38 = node36.isBreak();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        node36.addChildToFront(node42);
        com.google.javascript.rhino.Node node44 = node16.copyInformationFrom(node42);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder45 = node16.new FileLevelJsDocBuilder();
        boolean boolean46 = node16.isWhile();
        java.lang.String str47 = node16.getSourceFileName();
        node16.setCharno((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.removeChild(node16);
    }
}

