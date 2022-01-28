import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node8.isStringKey();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        boolean boolean30 = node28.isStringKey();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        node43.addSuppression("hi!");
        boolean boolean46 = node34.isEquivalentTo(node43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = node50.copyInformationFrom(node54);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node19, node28, node43, node54 };
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) '#', nodeArray56);
        boolean boolean58 = node57.isCall();
        int int59 = node57.getSourcePosition();
        node57.putIntProp(12, 37);
        com.google.javascript.rhino.Node node63 = node57.getNext();
        java.lang.Object obj65 = node57.getProp(52);
        boolean boolean66 = node57.isLabelName();
        com.google.javascript.rhino.Node node67 = node57.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node68 = node67.removeChildren();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(node67);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        boolean boolean20 = node19.isNot();
        boolean boolean21 = node19.isThis();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        boolean boolean46 = node45.isScript();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = node50.copyInformationFrom(node54);
        boolean boolean56 = node54.isStringKey();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node65 = node60.copyInformationFrom(node64);
        com.google.javascript.rhino.Node node66 = node54.srcrefTree(node65);
        boolean boolean67 = node65.isCatch();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node80 = node75.copyInformationFrom(node79);
        node80.addSuppression("hi!");
        boolean boolean83 = node71.isEquivalentTo(node80);
        boolean boolean84 = node71.isCase();
        boolean boolean85 = node71.isCast();
        com.google.javascript.rhino.Node node86 = node65.srcrefTree(node71);
        int int87 = node71.getChildCount();
        boolean boolean88 = node71.isSetterDef();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node89 = node45.clonePropsFrom(node71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Node has existing properties.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("GETELEM 0", 46, 47);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        int int10 = node9.getChangeTime();
        node9.setVarArgs(true);
        node9.setType(51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = node9.getJSDocInfo();
        boolean boolean16 = node9.isName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 0, node9);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(38, 55, (int) (short) 0);
        boolean boolean22 = node21.isNE();
        boolean boolean23 = node21.isIn();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node32 = node27.copyInformationFrom(node31);
        boolean boolean33 = node32.isAssignAdd();
        int int34 = node32.getCharno();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node39 = node38.cloneTree();
        boolean boolean40 = node38.isFunction();
        boolean boolean41 = node38.isRegExp();
        node32.addChildToBack(node38);
        boolean boolean43 = node32.isCase();
        node32.setOptionalArg(false);
        double double46 = node32.getDouble();
        double double47 = node32.getDouble();
        com.google.javascript.rhino.jstype.JSType jSType48 = node32.getJSType();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "", 0, (int) (short) 0);
        boolean boolean54 = node53.isExprResult();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (short) 0, "NUMBER 0.0 [var_args_name: 1]", (int) (short) 1, 43);
        boolean boolean60 = node59.isReturn();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node69 = node64.copyInformationFrom(node68);
        boolean boolean70 = node69.isAssignAdd();
        java.lang.String[] strArray74 = new java.lang.String[] { "NUMBER 0.0 [var_args_name: 1]", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet75 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet75, strArray74);
        node69.setDirectives((java.util.Set<java.lang.String>) strSet75);
        node59.setDirectives((java.util.Set<java.lang.String>) strSet75);
        node53.setDirectives((java.util.Set<java.lang.String>) strSet75);
        node32.setDirectives((java.util.Set<java.lang.String>) strSet75);
        node21.setDirectives((java.util.Set<java.lang.String>) strSet75);
        com.google.javascript.rhino.Node node82 = node9.copyInformationFrom(node21);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNull(jSType48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(node82);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, 38);
        com.google.javascript.rhino.Node node4 = node3.getFirstChild();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (short) 0, "NUMBER 0.0 [var_args_name: 1]", (int) (short) 1, 43);
        com.google.javascript.rhino.Node node10 = node3.copyInformationFromForTree(node9);
        boolean boolean11 = node9.isIn();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        boolean boolean20 = node19.isVarArgs();
        node19.putProp((int) (byte) 1, (java.lang.Object) "NUMBER 0.0\n");
        boolean boolean24 = node19.isLocalResultCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = null;
        com.google.javascript.rhino.Node node26 = node19.setJSDocInfo(jSDocInfo25);
        node19.setSourceEncodedPositionForTree(39);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder26 = node19.new FileLevelJsDocBuilder();
        boolean boolean27 = node19.isFunction();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("NUMBER 0.0", 4095, 30);
        com.google.javascript.rhino.Node node4 = node3.getLastChild();
        boolean boolean6 = node3.getBooleanProp(35);
        int int7 = node3.getLength();
        boolean boolean8 = node3.isParamList();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = node3.getJSDocInfo();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        node19.addChildToFront(node25);
        boolean boolean27 = node19.isDec();
        com.google.javascript.rhino.Node node28 = node19.cloneNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        node28.setSourceEncodedPosition(48);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node41 = node36.copyInformationFrom(node40);
        boolean boolean42 = node40.isStringKey();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node51 = node46.copyInformationFrom(node50);
        com.google.javascript.rhino.Node node52 = node40.srcrefTree(node51);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder53 = node40.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) ' ', node40);
        com.google.javascript.rhino.Node node55 = node54.removeChildren();
        com.google.javascript.rhino.Node node56 = node28.useSourceInfoIfMissingFromForTree(node54);
        node56.setVarArgs(true);
        boolean boolean59 = node56.isDo();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "Node tree inequality:\nTree1:\nERROR  0\n\n\nTree2:\nNUMBER 0.0\n\n\nSubtree1: ERROR  0\n\n\nSubtree2: NUMBER 0.0\n");
        boolean boolean3 = node2.isDelProp();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node9.isAssignAdd();
        boolean boolean11 = node9.isGetProp();
        java.lang.String str12 = node9.toStringTree();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node25 = node20.copyInformationFrom(node24);
        node25.addSuppression("hi!");
        boolean boolean28 = node16.isEquivalentTo(node25);
        node16.setDouble(1.0d);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node39 = node34.copyInformationFrom(node38);
        int int40 = node39.getChangeTime();
        boolean boolean41 = node39.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node50 = node45.copyInformationFrom(node49);
        int int51 = node50.getChangeTime();
        boolean boolean52 = node50.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(100, node9, node16, node39, node50);
        boolean boolean54 = node9.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node63 = node58.copyInformationFrom(node62);
        boolean boolean64 = node62.isStringKey();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node73 = node68.copyInformationFrom(node72);
        com.google.javascript.rhino.Node node74 = node62.srcrefTree(node73);
        com.google.javascript.rhino.Node node75 = node74.cloneNode();
        int int76 = node74.getCharno();
        boolean boolean77 = node74.isStringKey();
        com.google.javascript.rhino.Node node78 = node9.useSourceInfoIfMissingFrom(node74);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node88 = node83.copyInformationFrom(node87);
        com.google.javascript.rhino.Node node89 = node88.getLastSibling();
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node(100, node88);
        com.google.javascript.rhino.Node node91 = node90.removeFirstChild();
        node90.removeProp(50);
        com.google.javascript.rhino.Node node94 = node74.useSourceInfoFrom(node90);
        node94.setChangeTime(100);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NUMBER 0.0\n" + "'", str12, "NUMBER 0.0\n");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(node94);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) '#');
        sideEffectFlags1.setMutatesArguments();
        boolean boolean3 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.setReturnsTainted();
        boolean boolean6 = sideEffectFlags1.areAllFlagsSet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node5 = node4.cloneTree();
        boolean boolean6 = node4.isQuotedString();
        boolean boolean7 = node4.isHook();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), node4);
        boolean boolean9 = node8.isTrue();
        boolean boolean10 = node8.isString();
        boolean boolean11 = node8.isCase();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node20 = node15.copyInformationFrom(node19);
        boolean boolean21 = node20.isAssignAdd();
        int int22 = node20.getCharno();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node27 = node26.cloneTree();
        boolean boolean28 = node26.isFunction();
        boolean boolean29 = node26.isRegExp();
        node20.addChildToBack(node26);
        boolean boolean31 = node20.isDefaultCase();
        com.google.javascript.rhino.Node node32 = node8.copyInformationFromForTree(node20);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        // The following exception was thrown during execution in test generation
        try {
            node38.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 53, 38, 49);
        boolean boolean5 = node4.isSwitch();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) -1, node4, 42, (int) (short) -1);
        boolean boolean9 = node4.isNumber();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(38, 4, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node16 = node11.copyInformationFrom(node15);
        node16.addSuppression("hi!");
        boolean boolean19 = node7.isEquivalentTo(node16);
        boolean boolean20 = node16.isGetterDef();
        node16.setType((int) '#');
        boolean boolean23 = node16.isVar();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node32 = node27.copyInformationFrom(node31);
        boolean boolean33 = node31.isStringKey();
        boolean boolean34 = node31.isThrow();
        com.google.javascript.rhino.Node node35 = node31.getParent();
        node16.addChildToBack(node31);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder37 = node31.getJsDocBuilderForNode();
        node31.setSourceEncodedPositionForTree((int) (byte) 100);
        boolean boolean40 = node31.isFor();
        com.google.javascript.rhino.Node node41 = node3.useSourceInfoIfMissingFromForTree(node31);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        boolean boolean16 = node12.isGetterDef();
        node12.setType((int) '#');
        boolean boolean19 = node12.isVar();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node12.siblings();
        com.google.javascript.rhino.Node node21 = null;
        int int22 = node12.getIndexOfChild(node21);
        boolean boolean23 = node12.isDefaultCase();
        node12.putIntProp((int) (short) 0, 48);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100L);
        boolean boolean2 = node1.isAnd();
        boolean boolean3 = node1.isSetterDef();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        com.google.javascript.rhino.Node node10 = node9.getLastSibling();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        boolean boolean20 = node18.isStringKey();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        com.google.javascript.rhino.Node node30 = node18.srcrefTree(node29);
        boolean boolean31 = node30.isVarArgs();
        node30.putProp((int) (byte) 1, (java.lang.Object) "NUMBER 0.0\n");
        node9.addChildToBack(node30);
        boolean boolean36 = node9.isObjectLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node45 = node40.copyInformationFrom(node44);
        com.google.javascript.rhino.Node node46 = node45.getLastSibling();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = node50.copyInformationFrom(node54);
        boolean boolean56 = node54.isStringKey();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node65 = node60.copyInformationFrom(node64);
        com.google.javascript.rhino.Node node66 = node54.srcrefTree(node65);
        boolean boolean67 = node66.isVarArgs();
        node66.putProp((int) (byte) 1, (java.lang.Object) "NUMBER 0.0\n");
        node45.addChildToBack(node66);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        boolean boolean77 = node76.isFor();
        boolean boolean78 = node76.isStringKey();
        com.google.javascript.rhino.InputId inputId79 = null;
        node76.setInputId(inputId79);
        com.google.javascript.rhino.InputId inputId81 = node76.getInputId();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile82 = node76.getStaticSourceFile();
        boolean boolean83 = node76.isNull();
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        node76.setJSType(jSType84);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(0, node9, node66, node72, node76, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(inputId81);
        org.junit.Assert.assertNull(staticSourceFile82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) '#');
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setThrows();
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node8.isStringKey();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        boolean boolean30 = node28.isStringKey();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        node43.addSuppression("hi!");
        boolean boolean46 = node34.isEquivalentTo(node43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = node50.copyInformationFrom(node54);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node19, node28, node43, node54 };
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) '#', nodeArray56);
        boolean boolean58 = node57.isCall();
        int int59 = node57.getSourcePosition();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node68 = node63.copyInformationFrom(node67);
        boolean boolean69 = node67.isStringKey();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node78 = node73.copyInformationFrom(node77);
        com.google.javascript.rhino.Node node79 = node67.srcrefTree(node78);
        node79.detachChildren();
        double double81 = node79.getDouble();
        com.google.javascript.rhino.Node node82 = node57.srcref(node79);
        boolean boolean83 = node79.isSetterDef();
        boolean boolean84 = node79.isNot();
        boolean boolean85 = node79.isOnlyModifiesThisCall();
        boolean boolean86 = node79.isArrayLit();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node8.isStringKey();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        boolean boolean30 = node28.isStringKey();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        node43.addSuppression("hi!");
        boolean boolean46 = node34.isEquivalentTo(node43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = node50.copyInformationFrom(node54);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node19, node28, node43, node54 };
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) '#', nodeArray56);
        boolean boolean58 = node57.isCall();
        node57.setCharno((int) '#');
        com.google.javascript.rhino.InputId inputId61 = null;
        node57.setInputId(inputId61);
        boolean boolean63 = node57.isQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            double double64 = node57.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GETELEM 0 is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(55);
        node1.putBooleanProp(54, true);
        node1.setLength(4);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(36, 100, 46);
        node3.detachChildren();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node13 = node8.copyInformationFrom(node12);
        com.google.javascript.rhino.Node node14 = node13.getLastSibling();
        java.lang.String str15 = node13.getSourceFileName();
        boolean boolean16 = node13.isCall();
        boolean boolean17 = node13.isTry();
        int int18 = node3.getIndexOfChild(node13);
        node3.putBooleanProp(56, false);
        boolean boolean22 = node3.isThis();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0, 35, (int) (short) 1);
        boolean boolean4 = node3.isQuotedString();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            node3.appendStringTree(appendable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        boolean boolean20 = node18.isCatch();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        int int30 = node29.getChangeTime();
        boolean boolean31 = node29.hasMoreThanOneChild();
        java.lang.String str32 = node18.checkTreeEquals(node29);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node41 = node36.copyInformationFrom(node40);
        int int42 = node41.getChangeTime();
        node41.setVarArgs(true);
        java.lang.String str48 = node41.toString(false, true, true);
        com.google.javascript.rhino.Node node49 = node18.copyInformationFromForTree(node41);
        boolean boolean50 = node41.isCall();
        com.google.javascript.rhino.Node node51 = node41.getNext();
        // The following exception was thrown during execution in test generation
        try {
            int int53 = node51.getIntProp(51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "NUMBER 0.0 [var_args_name: 1]" + "'", str48, "NUMBER 0.0 [var_args_name: 1]");
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(node51);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        node3.setDouble(1.0d);
        int int18 = node3.getSideEffectFlags();
        java.lang.String str19 = node3.toString();
        java.lang.Object obj21 = node3.getProp(100);
        java.lang.String str22 = node3.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NUMBER 1.0" + "'", str19, "NUMBER 1.0");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "NUMBER 1.0" + "'", str22, "NUMBER 1.0");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node8.isStringKey();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node19);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node8.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) ' ', node8);
        com.google.javascript.rhino.Node node24 = node8.getAncestor((int) '#');
        node8.setChangeTime((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = node8.getAncestor(4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 51, 36, (int) (short) 10);
        boolean boolean4 = node3.isTry();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node13 = node8.copyInformationFrom(node12);
        boolean boolean14 = node12.isStringKey();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node23 = node18.copyInformationFrom(node22);
        com.google.javascript.rhino.Node node24 = node12.srcrefTree(node23);
        int int25 = node24.getLineno();
        com.google.javascript.rhino.Node node27 = node24.getAncestor(43);
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(409638, nodeArray31, (int) (byte) 0, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) 'a', nodeArray31);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(15, nodeArray31, 42, 0);
        java.lang.Object obj40 = node38.getProp(0);
        com.google.javascript.rhino.Node node41 = node24.useSourceInfoFrom(node38);
        com.google.javascript.rhino.Node node42 = node3.srcrefTree(node24);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeArray31);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node9.isAssignAdd();
        boolean boolean11 = node9.isFromExterns();
        boolean boolean12 = node9.isVarArgs();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node21 = node16.copyInformationFrom(node20);
        boolean boolean22 = node21.isAssignAdd();
        boolean boolean23 = node21.isTrue();
        boolean boolean24 = node21.wasEmptyNode();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node33 = node28.copyInformationFrom(node32);
        boolean boolean34 = node32.isStringKey();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        com.google.javascript.rhino.Node node44 = node32.srcrefTree(node43);
        com.google.javascript.rhino.Node node45 = node44.cloneNode();
        boolean boolean46 = node44.isLabelName();
        boolean boolean47 = node44.isName();
        boolean boolean48 = node44.isVarArgs();
        boolean boolean49 = node44.isCase();
        boolean boolean50 = node44.isVar();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(54, node9, node21, node44);
        boolean boolean52 = node44.isDelProp();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        node12.putBooleanProp(31, true);
        boolean boolean19 = node12.isHook();
        boolean boolean20 = node12.isInstanceOf();
        java.lang.String str21 = node12.getSourceFileName();
        int int22 = node12.getChangeTime();
        boolean boolean23 = node12.isQualifiedName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node40 = node35.copyInformationFrom(node39);
        int int42 = node39.getIntProp(49);
        com.google.javascript.rhino.Node node43 = node8.srcrefTree(node39);
        boolean boolean44 = node39.isGetterDef();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) '#');
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.clearAllFlags();
        int int4 = sideEffectFlags1.valueOf();
        sideEffectFlags1.setMutatesGlobalState();
        int int6 = sideEffectFlags1.valueOf();
        sideEffectFlags1.setAllFlags();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        node8.addSuppression("hi!");
        boolean boolean11 = node8.isNew();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) '#');
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.setAllFlags();
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) '4', (int) '#', 47);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        int int20 = node19.getLineno();
        boolean boolean21 = node19.isIf();
        boolean boolean22 = node19.isFor();
        boolean boolean23 = node19.isQuotedString();
        node19.setLength(47);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node8.isStringKey();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        boolean boolean30 = node28.isStringKey();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        node43.addSuppression("hi!");
        boolean boolean46 = node34.isEquivalentTo(node43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = node50.copyInformationFrom(node54);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node19, node28, node43, node54 };
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) '#', nodeArray56);
        java.lang.String str58 = node57.getQualifiedName();
        boolean boolean59 = node57.isHook();
        boolean boolean60 = node57.isNumber();
        com.google.javascript.rhino.Node node61 = node57.removeChildren();
        com.google.javascript.rhino.InputId inputId62 = null;
        node61.setInputId(inputId62);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node72 = node67.copyInformationFrom(node71);
        boolean boolean73 = node72.isAssignAdd();
        boolean boolean74 = node72.isTrue();
        boolean boolean75 = node72.wasEmptyNode();
        boolean boolean76 = node72.isCatch();
        boolean boolean77 = node72.isScript();
        com.google.javascript.rhino.Node node78 = node61.useSourceInfoFromForTree(node72);
        boolean boolean79 = node61.isContinue();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node8.isAssignAdd();
        int int10 = node8.getSourceOffset();
        boolean boolean11 = node8.isExprResult();
        boolean boolean12 = node8.isBlock();
        boolean boolean13 = node8.isUnscopedQualifiedName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        int int10 = node9.getChangeTime();
        node9.setVarArgs(true);
        java.lang.String str16 = node9.toString(false, true, true);
        boolean boolean17 = node9.isBreak();
        node9.addSuppression("NUMBER 0.0\n");
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node9);
        boolean boolean21 = node9.isCast();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder22 = node9.new FileLevelJsDocBuilder();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "NUMBER 0.0 [var_args_name: 1]" + "'", str16, "NUMBER 0.0 [var_args_name: 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(39, "NUMBER 0.0 [direct_eval: 52]");
        node2.setChangeTime(0);
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node8.isStringKey();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        boolean boolean30 = node28.isStringKey();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        node43.addSuppression("hi!");
        boolean boolean46 = node34.isEquivalentTo(node43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = node50.copyInformationFrom(node54);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node19, node28, node43, node54 };
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) '#', nodeArray56);
        boolean boolean58 = node57.isCall();
        int int59 = node57.getSourcePosition();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node68 = node63.copyInformationFrom(node67);
        boolean boolean69 = node67.isStringKey();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node78 = node73.copyInformationFrom(node77);
        com.google.javascript.rhino.Node node79 = node67.srcrefTree(node78);
        node79.detachChildren();
        double double81 = node79.getDouble();
        com.google.javascript.rhino.Node node82 = node57.srcref(node79);
        boolean boolean83 = node82.wasEmptyNode();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node92 = node87.copyInformationFrom(node91);
        boolean boolean93 = node82.isEquivalentToTyped(node92);
        boolean boolean94 = node92.isArrayLit();
        node92.setSourceEncodedPositionForTree(55);
        boolean boolean97 = node92.isEmpty();
        com.google.javascript.rhino.Node node98 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node99 = node92.srcrefTree(node98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 1L, 0, 50);
        boolean boolean4 = node3.isFalse();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder20 = node7.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = node25.copyInformationFrom(node29);
        int int31 = node30.getChangeTime();
        node30.setVarArgs(true);
        node30.setType(51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = node30.getJSDocInfo();
        boolean boolean37 = node30.isName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile38 = null;
        node30.setStaticSourceFile(staticSourceFile38);
        boolean boolean40 = node30.isWhile();
        boolean boolean41 = node30.isFalse();
        node7.putProp(100, (java.lang.Object) boolean41);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = node50.copyInformationFrom(node54);
        node55.addSuppression("hi!");
        boolean boolean58 = node46.isEquivalentTo(node55);
        boolean boolean59 = node46.isCase();
        boolean boolean60 = node46.isCast();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable61 = node46.siblings();
        boolean boolean62 = node46.isWith();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node71 = node66.copyInformationFrom(node70);
        boolean boolean72 = node70.isStringKey();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node81 = node76.copyInformationFrom(node80);
        com.google.javascript.rhino.Node node82 = node70.srcrefTree(node81);
        int int83 = node82.getLineno();
        boolean boolean84 = node82.isTrue();
        node46.addChildToBack(node82);
        boolean boolean86 = node46.isCatch();
        com.google.javascript.rhino.Node node87 = node7.copyInformationFrom(node46);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(jSDocInfo36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(nodeIterable61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(409638, nodeArray8, (int) (byte) 0, (int) (short) -1);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) 'a', nodeArray8);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(15, nodeArray8, 42, 0);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray8, 100, 37);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) '4', nodeArray8);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(8, nodeArray8);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) 0, nodeArray8);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 100, nodeArray8);
        node22.setLineno((int) (short) -1);
        org.junit.Assert.assertNotNull(nodeArray8);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        node19.addChildToFront(node25);
        int int28 = node19.getIntProp(56);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node19.children();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = node37.copyInformationFrom(node41);
        node42.addSuppression("hi!");
        boolean boolean45 = node33.isEquivalentTo(node42);
        node33.setDouble(1.0d);
        boolean boolean48 = node33.isSwitch();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node57 = node52.copyInformationFrom(node56);
        boolean boolean58 = node57.isAssignAdd();
        boolean boolean59 = node57.isFromExterns();
        boolean boolean60 = node57.isVarArgs();
        boolean boolean61 = node57.isDebugger();
        int int62 = node33.getIndexOfChild(node57);
        node19.addChildToBack(node33);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile64 = node19.getStaticSourceFile();
        com.google.javascript.rhino.Node node65 = null;
        // The following exception was thrown during execution in test generation
        try {
            node19.addChildToFront(node65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(staticSourceFile64);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        boolean boolean16 = node12.isGetterDef();
        node12.setType((int) '#');
        boolean boolean19 = node12.isIn();
        boolean boolean20 = node12.isInstanceOf();
        boolean boolean21 = node12.isTypeOf();
        boolean boolean22 = node12.isQualifiedName();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node31 = node26.copyInformationFrom(node30);
        boolean boolean32 = node31.isAssignAdd();
        boolean boolean33 = node31.isGetProp();
        boolean boolean34 = node31.isArrayLit();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node47 = node42.copyInformationFrom(node46);
        node47.addSuppression("hi!");
        boolean boolean50 = node38.isEquivalentTo(node47);
        boolean boolean51 = node47.isGetterDef();
        node47.setType((int) '#');
        node31.addChildToFront(node47);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node31.siblings();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node31.siblings();
        int int57 = node31.getSourcePosition();
        boolean boolean58 = node31.isRegExp();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) ' ', 51, 51);
        com.google.javascript.rhino.Node node63 = node62.cloneNode();
        boolean boolean64 = node31.isEquivalentTo(node63);
        java.lang.String str65 = node12.checkTreeEquals(node63);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Node tree inequality:\nTree1:\nGETELEM [jsdoc_info: JSDocInfo]\n\n\nTree2:\nTYPEOF 51\n\n\nSubtree1: GETELEM [jsdoc_info: JSDocInfo]\n\n\nSubtree2: TYPEOF 51\n" + "'", str65, "Node tree inequality:\nTree1:\nGETELEM [jsdoc_info: JSDocInfo]\n\n\nTree2:\nTYPEOF 51\n\n\nSubtree1: GETELEM [jsdoc_info: JSDocInfo]\n\n\nSubtree2: TYPEOF 51\n");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        int int20 = node19.getLength();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        boolean boolean30 = node29.isAssignAdd();
        boolean boolean31 = node29.isFromExterns();
        boolean boolean32 = node29.isVarArgs();
        boolean boolean33 = node29.isDebugger();
        int int34 = node29.getSideEffectFlags();
        int int35 = node29.getChildCount();
        boolean boolean36 = node29.isReturn();
        boolean boolean37 = node19.hasChild(node29);
        boolean boolean38 = node19.isReturn();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        boolean boolean23 = node19.isNull();
        boolean boolean24 = node19.isDec();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node33 = node28.copyInformationFrom(node32);
        com.google.javascript.rhino.Node node34 = node33.getLastSibling();
        java.lang.String str38 = node34.toString(false, false, false);
        com.google.javascript.rhino.Node node39 = node34.getLastChild();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node52 = node47.copyInformationFrom(node51);
        node52.addSuppression("hi!");
        boolean boolean55 = node43.isEquivalentTo(node52);
        boolean boolean56 = node43.isDelProp();
        com.google.javascript.rhino.InputId inputId57 = node43.getInputId();
        int int58 = node34.getIndexOfChild(node43);
        boolean boolean59 = node34.isObjectLit();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 100L);
        com.google.javascript.rhino.Node node62 = node61.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            node19.replaceChildAfter(node34, node62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NUMBER 0.0" + "'", str38, "NUMBER 0.0");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        int int9 = node8.getChangeTime();
        boolean boolean10 = node8.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        boolean boolean15 = node8.hasChild(node14);
        com.google.javascript.rhino.Node node17 = node8.getAncestor((int) (byte) 1);
        boolean boolean18 = node8.isOnlyModifiesThisCall();
        int int20 = node8.getIntProp(38);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node8.isStringKey();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        boolean boolean30 = node28.isStringKey();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        node43.addSuppression("hi!");
        boolean boolean46 = node34.isEquivalentTo(node43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = node50.copyInformationFrom(node54);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node19, node28, node43, node54 };
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) '#', nodeArray56);
        java.lang.String str58 = node57.getQualifiedName();
        boolean boolean59 = node57.isHook();
        boolean boolean60 = node57.isFor();
        boolean boolean61 = node57.isBreak();
        node57.putBooleanProp(0, false);
        boolean boolean66 = node57.getBooleanProp(0);
        java.lang.String str70 = node57.toString(true, false, true);
        node57.setCharno(0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "GETELEM 0" + "'", str70, "GETELEM 0");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 15);
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasOneChild();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NUMBER 15.0" + "'", str2, "NUMBER 15.0");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(409638, nodeArray4, (int) (byte) 0, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) 'a', nodeArray4);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(409638, nodeArray4, 42, 15);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(56, nodeArray4);
        boolean boolean13 = node12.isTry();
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}

