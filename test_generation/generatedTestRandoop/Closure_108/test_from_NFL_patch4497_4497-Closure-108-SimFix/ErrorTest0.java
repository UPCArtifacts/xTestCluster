import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray1, (int) (byte) -1, (int) (short) 1);
        boolean boolean5 = node4.isCast();
        com.google.javascript.rhino.InputId inputId6 = node4.getInputId();
        node4.setType((int) 'a');
        java.util.Set<java.lang.String> strSet9 = node4.getDirectives();
        boolean boolean10 = node4.hasMoreThanOneChild();
        boolean boolean11 = node4.isParamList();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node4.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray2, (int) (byte) -1, (int) (short) 1);
        boolean boolean6 = node5.isIn();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray8, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node[] nodeArray13 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray13, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node node17 = node11.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray19, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray24, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = node22.useSourceInfoIfMissingFrom(node27);
        boolean boolean29 = node16.isEquivalentToTyped(node28);
        boolean boolean30 = node16.isNull();
        com.google.javascript.rhino.Node node31 = node5.copyInformationFromForTree(node16);
        boolean boolean32 = node16.isSetterDef();
        boolean boolean33 = node16.isLabel();
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray35, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray40, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node node44 = node38.useSourceInfoIfMissingFrom(node43);
        boolean boolean45 = node38.isCatch();
        com.google.javascript.rhino.Node node46 = node16.useSourceInfoIfMissingFrom(node38);
        com.google.javascript.rhino.Node[] nodeArray49 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray49, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node[] nodeArray54 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray54, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node node58 = node52.useSourceInfoIfMissingFrom(node57);
        boolean boolean59 = node52.isFor();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0, node52, 0, 0);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(30, node16, node62, (int) (short) -1, 16);
        boolean boolean66 = node65.isThis();
        boolean boolean67 = node65.isNE();
        node65.setVarArgs(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node65.getChildAtIndex(38);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray1, (int) (byte) -1, (int) (short) 1);
        boolean boolean5 = node4.isIn();
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray7, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray12, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node node16 = node10.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray18, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray23, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node node27 = node21.useSourceInfoIfMissingFrom(node26);
        boolean boolean28 = node15.isEquivalentToTyped(node27);
        boolean boolean29 = node15.isNull();
        com.google.javascript.rhino.Node node30 = node4.copyInformationFromForTree(node15);
        boolean boolean31 = node15.isCase();
        boolean boolean32 = node15.isSyntheticBlock();
        java.lang.String str33 = node15.getQualifiedName();
        boolean boolean34 = node15.isLabelName();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable35 = node15.getAncestors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node15.getChildAtIndex((int) (short) 100);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray1, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray6, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node node10 = node4.useSourceInfoIfMissingFrom(node9);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray12, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray17, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node node21 = node15.useSourceInfoIfMissingFrom(node20);
        boolean boolean22 = node9.isEquivalentToTyped(node21);
        boolean boolean23 = node9.isNull();
        boolean boolean24 = node9.wasEmptyNode();
        boolean boolean25 = node9.isCase();
        boolean boolean26 = node9.isFromExterns();
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray28, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray33, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node node37 = node31.useSourceInfoIfMissingFrom(node36);
        com.google.javascript.rhino.Node node38 = node36.getLastSibling();
        boolean boolean39 = node36.isIn();
        boolean boolean40 = node9.isEquivalentToTyped(node36);
        node9.setOptionalArg(false);
        boolean boolean43 = node9.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node45 = node9.getChildAtIndex(56);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray2, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (byte) 1, nodeArray2, 2, (int) ' ');
        java.lang.String str9 = node8.getQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node8.getChildAtIndex(47);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(4, "");
        com.google.javascript.rhino.Node node3 = node2.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node2.getChildAtIndex(37);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray2, (int) (byte) -1, (int) (short) 1);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (byte) 100, nodeArray2, 1, 4095);
        boolean boolean9 = node8.isNot();
        boolean boolean10 = node8.isArrayLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node8.getChildAtIndex((int) ' ');
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 100, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = node2.getChildAtIndex((int) 'a');
    }
}

