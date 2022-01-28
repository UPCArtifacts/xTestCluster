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
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 [var_args_name: 1]", 56, 0);
        int int4 = node3.getChildCount();
        boolean boolean5 = node3.isIn();
        boolean boolean6 = node3.isDelProp();
        node3.setCharno(16);
        com.google.javascript.rhino.Node node9 = node3.getLastSibling();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = node3.getJSDocInfo();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(jSDocInfo10);
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
        com.google.javascript.rhino.Node node20 = node19.cloneNode();
        boolean boolean21 = node19.isLabelName();
        boolean boolean22 = node19.isName();
        boolean boolean23 = node19.isVarArgs();
        boolean boolean24 = node19.isCase();
        boolean boolean25 = node19.isVar();
        boolean boolean26 = node19.isDo();
        com.google.javascript.rhino.Node node27 = node19.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = node27.getAncestor(48);
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 1, 100);
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = null;
        com.google.javascript.rhino.Node node5 = node3.setJSDocInfo(jSDocInfo4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node14 = node9.copyInformationFrom(node13);
        com.google.javascript.rhino.Node node15 = node14.getLastSibling();
        java.lang.String str16 = node14.getSourceFileName();
        boolean boolean17 = node14.isCall();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("BITXOR", 32, 0);
        com.google.javascript.rhino.Node node22 = node14.useSourceInfoIfMissingFrom(node21);
        node14.setType((-1));
        boolean boolean25 = node14.isFalse();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) ' ', "NUMBER 0.0\n", (int) 'a', 8);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node41 = node36.copyInformationFrom(node40);
        boolean boolean42 = node40.isStringKey();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node51 = node46.copyInformationFrom(node50);
        com.google.javascript.rhino.Node node52 = node40.srcrefTree(node51);
        boolean boolean53 = node52.isScript();
        boolean boolean54 = node52.isBreak();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        node52.addChildToFront(node58);
        boolean boolean60 = node52.isDec();
        com.google.javascript.rhino.Node node61 = node52.cloneNode();
        boolean boolean62 = node61.isWhile();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(38, node61, 51, (int) (short) 1);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 54);
        com.google.javascript.rhino.Node node68 = node65.clonePropsFrom(node67);
        node68.addSuppression("Node tree inequality:\nTree1:\nGETELEM [jsdoc_info: JSDocInfo]\n\n\nTree2:\nNUMBER 0.0\n\n\nSubtree1: GETELEM [jsdoc_info: JSDocInfo]\n\n\nSubtree2: NUMBER 0.0\n");
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(29, node31, node68);
        com.google.javascript.rhino.Node node72 = node14.useSourceInfoIfMissingFrom(node31);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node73 = node5.removeChildAfter(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node72);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node8.isStringKey();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node19);
        boolean boolean21 = node20.isScript();
        boolean boolean22 = node20.isBreak();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        node20.addChildToFront(node26);
        boolean boolean28 = node20.isDec();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        boolean boolean30 = node29.isWhile();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(38, node29, 51, (int) (short) 1);
        boolean boolean34 = node33.isVar();
        boolean boolean35 = node33.isDo();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(8, (int) (short) 1, (int) (short) 0);
        com.google.javascript.rhino.Node node4 = node3.cloneTree();
        boolean boolean5 = node3.isFunction();
        boolean boolean6 = node3.isRegExp();
        boolean boolean7 = node3.isFalse();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node16 = node11.copyInformationFrom(node15);
        boolean boolean17 = node15.isStringKey();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node26 = node21.copyInformationFrom(node25);
        com.google.javascript.rhino.Node node27 = node15.srcrefTree(node26);
        com.google.javascript.rhino.Node node28 = node27.cloneNode();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node37 = node32.copyInformationFrom(node36);
        boolean boolean38 = node28.hasChild(node32);
        java.util.Set<java.lang.String> strSet39 = node28.getDirectives();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = node28.getJSDocInfo();
        java.util.Set<java.lang.String> strSet41 = node28.getDirectives();
        com.google.javascript.rhino.Node node42 = node3.copyInformationFromForTree(node28);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(strSet39);
        org.junit.Assert.assertNull(jSDocInfo40);
        org.junit.Assert.assertNull(strSet41);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node7.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node21 = node16.copyInformationFrom(node20);
        boolean boolean22 = node21.isAssignAdd();
        java.lang.String[] strArray26 = new java.lang.String[] { "NUMBER 0.0 [var_args_name: 1]", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        node21.setDirectives((java.util.Set<java.lang.String>) strSet27);
        boolean boolean30 = node21.isContinue();
        node12.addChildrenToBack(node21);
        boolean boolean32 = node12.isNew();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 100, 31, 4095);
        com.google.javascript.rhino.Node node37 = node12.useSourceInfoFrom(node36);
        com.google.javascript.rhino.InputId inputId38 = null;
        node36.setInputId(inputId38);
        node36.setDouble((double) (byte) 0);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile42 = node36.getStaticSourceFile();
        node7.addChildrenToFront(node36);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 43, 409638, (int) (byte) 100);
        node7.addChildrenToFront(node47);
        boolean boolean49 = node7.isVar();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(staticSourceFile42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
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
        com.google.javascript.rhino.Node node20 = node19.cloneNode();
        boolean boolean21 = node19.isLabelName();
        boolean boolean22 = node19.isName();
        boolean boolean23 = node19.isVarArgs();
        boolean boolean24 = node19.isCast();
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node26 = node19.srcref(node25);
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        int int9 = node8.getChangeTime();
        node8.setVarArgs(true);
        java.lang.String str15 = node8.toString(false, true, true);
        boolean boolean16 = node8.isBreak();
        node8.addSuppression("NUMBER 0.0\n");
        com.google.javascript.rhino.jstype.JSType jSType19 = node8.getJSType();
        node8.setType(48);
        com.google.javascript.rhino.jstype.JSType jSType22 = node8.getJSType();
        int int23 = node8.getCharno();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NUMBER 0.0 [var_args_name: 1]" + "'", str15, "NUMBER 0.0 [var_args_name: 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        node9.setCharno((int) 'a');
        boolean boolean56 = node9.isVarArgs();
        boolean boolean57 = node9.isTry();
        java.lang.Object obj59 = node9.getProp(4);
        com.google.javascript.rhino.Node[] nodeArray64 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(409638, nodeArray64, (int) (byte) 0, (int) (short) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) 'a', nodeArray64);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(15, nodeArray64, 42, 0);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((-1), nodeArray64);
        int int73 = node9.getIndexOfChild(node72);
        node9.putBooleanProp(55, false);
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(nodeArray64);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node10 = node5.copyInformationFrom(node9);
        boolean boolean11 = node9.isStringKey();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node20 = node15.copyInformationFrom(node19);
        com.google.javascript.rhino.Node node21 = node9.srcrefTree(node20);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = node25.copyInformationFrom(node29);
        boolean boolean31 = node29.isStringKey();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node44 = node39.copyInformationFrom(node43);
        node44.addSuppression("hi!");
        boolean boolean47 = node35.isEquivalentTo(node44);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node56 = node51.copyInformationFrom(node55);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node20, node29, node44, node55 };
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) '#', nodeArray57);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(53, nodeArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeArray57);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        boolean boolean40 = node38.isStringKey();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node49 = node44.copyInformationFrom(node48);
        com.google.javascript.rhino.Node node50 = node38.srcrefTree(node49);
        com.google.javascript.rhino.Node node51 = node50.cloneNode();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node60 = node55.copyInformationFrom(node59);
        boolean boolean61 = node51.hasChild(node55);
        boolean boolean62 = node55.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = null;
        com.google.javascript.rhino.Node node64 = node55.setJSDocInfo(jSDocInfo63);
        com.google.javascript.rhino.Node node65 = node20.useSourceInfoFrom(node55);
        com.google.javascript.rhino.Node node66 = node55.getNext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = node66.isObjectLit();
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(node66);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        com.google.javascript.rhino.Node node51 = node41.removeChildren();
        boolean boolean52 = node41.isTry();
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        int int31 = node24.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = node24.getJSDocInfo();
        node24.detachChildren();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node24.siblings();
        node24.putBooleanProp(38, false);
        boolean boolean38 = node24.isDo();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(jSDocInfo32);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        java.lang.String str20 = node14.getQualifiedName();
        java.lang.String str21 = node14.getQualifiedName();
        boolean boolean22 = node14.isCase();
        boolean boolean23 = node14.isDebugger();
        int int24 = node14.getSourceOffset();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        java.lang.String str60 = node57.toString();
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "GETELEM 0" + "'", str60, "GETELEM 0");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        boolean boolean16 = node3.isCase();
        boolean boolean17 = node3.isCast();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node3.siblings();
        boolean boolean19 = node3.isOptionalArg();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = node13.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node18);
        com.google.javascript.rhino.Node node20 = node19.cloneNode();
        com.google.javascript.rhino.InputId inputId21 = null;
        node19.setInputId(inputId21);
        node19.detachChildren();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = node19.getStaticSourceFile();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node33 = node28.copyInformationFrom(node32);
        boolean boolean34 = node33.isAssignAdd();
        boolean boolean35 = node33.isFromExterns();
        boolean boolean36 = node33.isVarArgs();
        boolean boolean37 = node33.isBreak();
        com.google.javascript.rhino.Node node38 = node19.srcrefTree(node33);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(staticSourceFile24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        int int25 = node19.getIntProp((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        boolean boolean87 = node54.isObjectLit();
        boolean boolean88 = node54.isSyntheticBlock();
        node54.setSourceEncodedPositionForTree((int) (byte) -1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Node tree inequality:\nTree1:\nGETELEM [jsdoc_info: JSDocInfo]\n\n\nTree2:\nNUMBER 0.0\n\n\nSubtree1: GETELEM [jsdoc_info: JSDocInfo]\n\n\nSubtree2: NUMBER 0.0\n" + "'", str50, "Node tree inequality:\nTree1:\nGETELEM [jsdoc_info: JSDocInfo]\n\n\nTree2:\nNUMBER 0.0\n\n\nSubtree1: GETELEM [jsdoc_info: JSDocInfo]\n\n\nSubtree2: NUMBER 0.0\n");
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = node3.copyInformationFrom(node7);
        boolean boolean9 = node8.isAssignAdd();
        boolean boolean10 = node8.isTrue();
        boolean boolean11 = node8.wasEmptyNode();
        boolean boolean12 = node8.isStringKey();
        com.google.javascript.rhino.Node node13 = node8.getParent();
        boolean boolean14 = node8.isReturn();
        com.google.javascript.rhino.Node node15 = node8.getLastSibling();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(39, 40, (int) '#');
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node19);
        boolean boolean21 = node8.isSetterDef();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, 38);
        int int4 = node3.getSourcePosition();
        node3.setDouble((double) (short) 10);
        node3.setCharno(47);
        boolean boolean9 = node3.isEmpty();
        boolean boolean10 = node3.isArrayLit();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 409638 + "'", int4 == 409638);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100L);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) '4', "", 15, 4);
        com.google.javascript.rhino.Node node7 = node1.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node16 = node11.copyInformationFrom(node15);
        boolean boolean17 = node16.isAssignAdd();
        boolean boolean18 = node16.isFromExterns();
        boolean boolean19 = node16.isVarArgs();
        node16.setSourceFileForTesting("NUMBER 0.0");
        com.google.javascript.rhino.Node node22 = node7.useSourceInfoIfMissingFrom(node16);
        boolean boolean23 = node22.isBlock();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node22.siblings();
        boolean boolean25 = node22.isVoid();
        boolean boolean26 = node22.isVarArgs();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 [var_args_name: 1]", 56, 0);
        int int4 = node3.getChildCount();
        boolean boolean5 = node3.isIn();
        boolean boolean6 = node3.isDelProp();
        node3.removeProp(29);
        com.google.javascript.rhino.Node node10 = node3.getAncestor((int) (byte) 100);
        boolean boolean11 = node3.isDefaultCase();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node21 = node16.copyInformationFrom(node20);
        boolean boolean22 = node20.isStringKey();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node31 = node26.copyInformationFrom(node30);
        com.google.javascript.rhino.Node node32 = node20.srcrefTree(node31);
        boolean boolean33 = node32.isScript();
        boolean boolean34 = node32.isBreak();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        boolean boolean44 = node42.isStringKey();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node53 = node48.copyInformationFrom(node52);
        com.google.javascript.rhino.Node node54 = node42.srcrefTree(node53);
        boolean boolean55 = node54.isScript();
        com.google.javascript.rhino.Node node56 = node32.useSourceInfoFrom(node54);
        boolean boolean57 = node56.isSetterDef();
        boolean boolean58 = node56.isAssignAdd();
        node3.putProp(4, (java.lang.Object) node56);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node9 = node4.copyInformationFrom(node8);
        boolean boolean10 = node8.isStringKey();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = node14.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node19);
        boolean boolean21 = node19.isCatch();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node34 = node29.copyInformationFrom(node33);
        node34.addSuppression("hi!");
        boolean boolean37 = node25.isEquivalentTo(node34);
        boolean boolean38 = node25.isCase();
        boolean boolean39 = node25.isCast();
        com.google.javascript.rhino.Node node40 = node19.srcrefTree(node25);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable41 = node25.getAncestors();
        boolean boolean42 = node25.isLabelName();
        node25.setOptionalArg(false);
        com.google.javascript.rhino.Node node45 = node25.cloneTree();
        node25.setVarArgs(false);
        node25.removeProp(54);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(53, node25);
        boolean boolean51 = node25.isBlock();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(ancestorIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        node57.setWasEmptyNode(true);
        boolean boolean63 = node57.hasMoreThanOneChild();
        boolean boolean64 = node57.isNumber();
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node12 = node7.copyInformationFrom(node11);
        node12.addSuppression("hi!");
        boolean boolean15 = node3.isEquivalentTo(node12);
        boolean boolean16 = node3.isNot();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 0, node21, (int) (short) 1, 49);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node33 = node28.copyInformationFrom(node32);
        boolean boolean34 = node32.isStringKey();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        com.google.javascript.rhino.Node node44 = node32.srcrefTree(node43);
        boolean boolean45 = node44.isScript();
        boolean boolean46 = node44.isBreak();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node55 = node50.copyInformationFrom(node54);
        boolean boolean56 = node54.isStringKey();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node65 = node60.copyInformationFrom(node64);
        com.google.javascript.rhino.Node node66 = node54.srcrefTree(node65);
        boolean boolean67 = node66.isScript();
        com.google.javascript.rhino.Node node68 = node44.useSourceInfoFrom(node66);
        int int69 = node21.getIndexOfChild(node44);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node82 = node77.copyInformationFrom(node81);
        node82.addSuppression("hi!");
        boolean boolean85 = node73.isEquivalentTo(node82);
        boolean boolean86 = node73.isDelProp();
        boolean boolean87 = node73.isDo();
        java.lang.Object obj89 = node73.getProp(55);
        com.google.javascript.rhino.Node node90 = node44.useSourceInfoFromForTree(node73);
        int int91 = node90.getChildCount();
        boolean boolean92 = node3.isEquivalentToTyped(node90);
        boolean boolean93 = node90.isOnlyModifiesThisCall();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
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
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(409638, nodeArray4, (int) (byte) 0, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) 'a', nodeArray4);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(15, nodeArray4, 42, 0);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node20 = node15.copyInformationFrom(node19);
        boolean boolean21 = node19.isStringKey();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node30 = node25.copyInformationFrom(node29);
        com.google.javascript.rhino.Node node31 = node19.srcrefTree(node30);
        boolean boolean32 = node31.isScript();
        boolean boolean33 = node31.isGetterDef();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node43 = node38.copyInformationFrom(node42);
        boolean boolean44 = node43.isAssignAdd();
        boolean boolean45 = node43.isGetProp();
        java.lang.String str46 = node43.toStringTree();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node59 = node54.copyInformationFrom(node58);
        node59.addSuppression("hi!");
        boolean boolean62 = node50.isEquivalentTo(node59);
        node50.setDouble(1.0d);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node73 = node68.copyInformationFrom(node72);
        int int74 = node73.getChangeTime();
        boolean boolean75 = node73.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) ' ', (-1));
        com.google.javascript.rhino.Node node84 = node79.copyInformationFrom(node83);
        int int85 = node84.getChangeTime();
        boolean boolean86 = node84.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(100, node43, node50, node73, node84);
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newNumber((double) 47, 48, (int) '4');
        node73.addChildToFront(node91);
        boolean boolean93 = node73.isFromExterns();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node94 = new com.google.javascript.rhino.Node(54, node11, node31, node73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "NUMBER 0.0\n" + "'", str46, "NUMBER 0.0\n");
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
}

