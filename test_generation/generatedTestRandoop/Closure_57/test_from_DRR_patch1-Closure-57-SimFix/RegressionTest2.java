import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean18 = closureCodingConvention0.isExported("hi!", false);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection19 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str20 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = closureCodingConvention0.isVarArgsParameter(node21);
        java.lang.String str23 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str24 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = closureCodingConvention0.getSingletonGetterClassName(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.abstractMethod" + "'", str20, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "goog.exportSymbol" + "'", str23, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.exportProperty" + "'", str24, "goog.exportProperty");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean14 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str16 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = closureCodingConvention0.isPropertyTestFunction(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.abstractMethod" + "'", str16, "goog.abstractMethod");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean14 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean16 = closureCodingConvention0.isValidEnumKey("");
        java.lang.String str17 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = closureCodingConvention0.isOptionalParameter(node18);
        boolean boolean21 = closureCodingConvention0.isExported("goog.exportProperty");
        java.lang.String str22 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.global" + "'", str17, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention5 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention5.isOptionalParameter(node6);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention5.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap15);
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean19 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        java.lang.String str20 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str21 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind23 = closureCodingConvention0.describeFunctionBind(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.abstractMethod" + "'", str21, "goog.abstractMethod");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention15 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention15.isOptionalParameter(node16);
        java.lang.String str18 = closureCodingConvention15.getAbstractMethodName();
        java.lang.String str19 = closureCodingConvention15.getGlobalObject();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship21 = closureCodingConvention15.getDelegateRelationship(node20);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.jscomp.Scope scope23 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention24 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = closureCodingConvention24.isOptionalParameter(node25);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.jscomp.Scope scope28 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray29 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList30, objectTypeArray29);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry27, scope28, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList30, strMap32);
        java.util.Map<java.lang.String, java.lang.String> strMap34 = null;
        closureCodingConvention15.defineDelegateProxyPrototypeProperties(jSTypeRegistry22, scope23, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList30, strMap34);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList30, strMap36);
        boolean boolean40 = closureCodingConvention0.isExported("hi!", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.abstractMethod" + "'", str18, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection1 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection1);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention5 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention5.isOptionalParameter(node6);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention5.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap15);
        com.google.javascript.rhino.Node node17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node17, strMap18);
        boolean boolean21 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        boolean boolean23 = closureCodingConvention0.isConstant("goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        boolean boolean9 = closureCodingConvention0.isExported("goog.exportSymbol");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection10 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean14 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = null;
        closureCodingConvention0.applySubclassRelationship(functionType15, functionType16, subclassType17);
        boolean boolean20 = closureCodingConvention0.isExported("goog.global");
        boolean boolean22 = closureCodingConvention0.isConstantKey("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("goog.exportProperty");
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isValidEnumKey("");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection13 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node14 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node14, strMap15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection13);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean14 = closureCodingConvention0.isPrivate("goog.global");
        boolean boolean16 = closureCodingConvention0.isExported("hi!");
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = closureCodingConvention0.isOptionalParameter(node17);
        com.google.javascript.rhino.Node node19 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node19, strMap20);
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType22, functionType23, objectType24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean5 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        java.lang.String str8 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportProperty" + "'", str8, "goog.exportProperty");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isExported("goog.global");
        boolean boolean7 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention10 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention10.isOptionalParameter(node11);
        boolean boolean14 = closureCodingConvention10.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention10.isOptionalParameter(node15);
        boolean boolean18 = closureCodingConvention10.isConstantKey("hi!");
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = closureCodingConvention10.isVarArgsParameter(node19);
        boolean boolean22 = closureCodingConvention10.isExported("");
        java.lang.String str23 = closureCodingConvention10.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.jscomp.Scope scope25 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention26 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node27 = null;
        boolean boolean28 = closureCodingConvention26.isOptionalParameter(node27);
        java.lang.String str29 = closureCodingConvention26.getAbstractMethodName();
        java.lang.String str30 = closureCodingConvention26.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection31 = closureCodingConvention26.getAssertionFunctions();
        boolean boolean33 = closureCodingConvention26.isConstant("goog.global");
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship35 = closureCodingConvention26.getDelegateRelationship(node34);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType39 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType40 = null;
        closureCodingConvention26.applyDelegateRelationship(objectType36, objectType37, objectType38, functionType39, functionType40);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = null;
        com.google.javascript.jscomp.Scope scope43 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention44 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node45 = null;
        boolean boolean46 = closureCodingConvention44.isOptionalParameter(node45);
        boolean boolean48 = closureCodingConvention44.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = null;
        com.google.javascript.jscomp.Scope scope50 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention51 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node52 = null;
        boolean boolean53 = closureCodingConvention51.isOptionalParameter(node52);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = null;
        com.google.javascript.jscomp.Scope scope55 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray56 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList57 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList57, objectTypeArray56);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        closureCodingConvention51.defineDelegateProxyPrototypeProperties(jSTypeRegistry54, scope55, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList57, strMap59);
        java.util.Map<java.lang.String, java.lang.String> strMap61 = null;
        closureCodingConvention44.defineDelegateProxyPrototypeProperties(jSTypeRegistry49, scope50, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList57, strMap61);
        java.util.Map<java.lang.String, java.lang.String> strMap63 = null;
        closureCodingConvention26.defineDelegateProxyPrototypeProperties(jSTypeRegistry42, scope43, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList57, strMap63);
        java.util.Map<java.lang.String, java.lang.String> strMap65 = null;
        closureCodingConvention10.defineDelegateProxyPrototypeProperties(jSTypeRegistry24, scope25, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList57, strMap65);
        java.util.Map<java.lang.String, java.lang.String> strMap67 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList57, strMap67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "goog.abstractMethod" + "'", str29, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "goog.global" + "'", str30, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(delegateRelationship35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectTypeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        boolean boolean9 = closureCodingConvention0.isExported("goog.exportSymbol");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection10 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray5 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList6 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList6, objectTypeArray5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList6, strMap8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        java.lang.Class<?> wildcardClass17 = closureCodingConvention0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectTypeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isConstantKey("");
        java.lang.String str6 = closureCodingConvention0.getExportSymbolFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection7 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.exportSymbol" + "'", str6, "goog.exportSymbol");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection7);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isExported("hi!");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean11 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship15 = closureCodingConvention0.getDelegateRelationship(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention0.getDelegateRelationship(node16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertNull(delegateRelationship15);
        org.junit.Assert.assertNull(delegateRelationship17);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean12 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str16 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node17, strMap18);
        boolean boolean21 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        java.lang.String str22 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.abstractMethod" + "'", str16, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.exportProperty" + "'", str22, "goog.exportProperty");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = closureCodingConvention0.getSingletonGetterClassName(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean14 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean16 = closureCodingConvention0.isValidEnumKey("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention19 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention19.isOptionalParameter(node20);
        boolean boolean23 = closureCodingConvention19.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention19.isOptionalParameter(node24);
        boolean boolean27 = closureCodingConvention19.isConstantKey("hi!");
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = closureCodingConvention19.isVarArgsParameter(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = closureCodingConvention19.isVarArgsParameter(node30);
        com.google.javascript.rhino.Node node32 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        closureCodingConvention19.checkForCallingConventionDefiningCalls(node32, strMap33);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType36 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType37 = null;
        closureCodingConvention19.applySubclassRelationship(functionType35, functionType36, subclassType37);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.jscomp.Scope scope40 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention41 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = closureCodingConvention41.isOptionalParameter(node42);
        boolean boolean45 = closureCodingConvention41.isSuperClassReference("hi!");
        boolean boolean47 = closureCodingConvention41.isSuperClassReference("goog.global");
        boolean boolean49 = closureCodingConvention41.isConstant("goog.abstractMethod");
        boolean boolean51 = closureCodingConvention41.isValidEnumKey("hi!");
        boolean boolean53 = closureCodingConvention41.isSuperClassReference("goog.global");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = null;
        com.google.javascript.jscomp.Scope scope55 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention56 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean58 = closureCodingConvention56.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection59 = closureCodingConvention56.getAssertionFunctions();
        java.lang.String str60 = closureCodingConvention56.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = null;
        com.google.javascript.jscomp.Scope scope62 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention63 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node64 = null;
        boolean boolean65 = closureCodingConvention63.isOptionalParameter(node64);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = null;
        com.google.javascript.jscomp.Scope scope67 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention68 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node69 = null;
        boolean boolean70 = closureCodingConvention68.isOptionalParameter(node69);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = null;
        com.google.javascript.jscomp.Scope scope72 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray73 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList74 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList74, objectTypeArray73);
        java.util.Map<java.lang.String, java.lang.String> strMap76 = null;
        closureCodingConvention68.defineDelegateProxyPrototypeProperties(jSTypeRegistry71, scope72, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList74, strMap76);
        java.util.Map<java.lang.String, java.lang.String> strMap78 = null;
        closureCodingConvention63.defineDelegateProxyPrototypeProperties(jSTypeRegistry66, scope67, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList74, strMap78);
        java.util.Map<java.lang.String, java.lang.String> strMap80 = null;
        closureCodingConvention56.defineDelegateProxyPrototypeProperties(jSTypeRegistry61, scope62, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList74, strMap80);
        java.util.Map<java.lang.String, java.lang.String> strMap82 = null;
        closureCodingConvention41.defineDelegateProxyPrototypeProperties(jSTypeRegistry54, scope55, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList74, strMap82);
        java.util.Map<java.lang.String, java.lang.String> strMap84 = null;
        closureCodingConvention19.defineDelegateProxyPrototypeProperties(jSTypeRegistry39, scope40, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList74, strMap84);
        java.util.Map<java.lang.String, java.lang.String> strMap86 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry17, scope18, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList74, strMap86);
        boolean boolean89 = closureCodingConvention0.isConstant("goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "goog.global" + "'", str60, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectTypeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("hi!");
        java.lang.String str11 = closureCodingConvention0.getGlobalObject();
        boolean boolean13 = closureCodingConvention0.isPrivate("");
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship12 = closureCodingConvention0.getDelegateRelationship(node11);
        boolean boolean14 = closureCodingConvention0.isSuperClassReference("goog.global");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(delegateRelationship12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean6 = closureCodingConvention0.isExported("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        boolean boolean14 = closureCodingConvention0.isSuperClassReference("");
        boolean boolean16 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.jscomp.Scope scope7 = null;
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry6, scope7, objectTypeList8, strMap9);
        boolean boolean12 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean14 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention0.isOptionalParameter(node16);
        boolean boolean19 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection1 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.jscomp.Scope scope7 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention8 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention8.isOptionalParameter(node9);
        boolean boolean12 = closureCodingConvention8.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention8.isOptionalParameter(node13);
        boolean boolean16 = closureCodingConvention8.isConstantKey("hi!");
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = closureCodingConvention8.isVarArgsParameter(node17);
        boolean boolean20 = closureCodingConvention8.isExported("");
        java.lang.String str21 = closureCodingConvention8.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.jscomp.Scope scope23 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention24 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = closureCodingConvention24.isOptionalParameter(node25);
        java.lang.String str27 = closureCodingConvention24.getAbstractMethodName();
        java.lang.String str28 = closureCodingConvention24.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection29 = closureCodingConvention24.getAssertionFunctions();
        boolean boolean31 = closureCodingConvention24.isConstant("goog.global");
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship33 = closureCodingConvention24.getDelegateRelationship(node32);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType37 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType38 = null;
        closureCodingConvention24.applyDelegateRelationship(objectType34, objectType35, objectType36, functionType37, functionType38);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = null;
        com.google.javascript.jscomp.Scope scope41 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention42 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node43 = null;
        boolean boolean44 = closureCodingConvention42.isOptionalParameter(node43);
        boolean boolean46 = closureCodingConvention42.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = null;
        com.google.javascript.jscomp.Scope scope48 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention49 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node50 = null;
        boolean boolean51 = closureCodingConvention49.isOptionalParameter(node50);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = null;
        com.google.javascript.jscomp.Scope scope53 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray54 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, objectTypeArray54);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        closureCodingConvention49.defineDelegateProxyPrototypeProperties(jSTypeRegistry52, scope53, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap57);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        closureCodingConvention42.defineDelegateProxyPrototypeProperties(jSTypeRegistry47, scope48, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap59);
        java.util.Map<java.lang.String, java.lang.String> strMap61 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry40, scope41, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap61);
        java.util.Map<java.lang.String, java.lang.String> strMap63 = null;
        closureCodingConvention8.defineDelegateProxyPrototypeProperties(jSTypeRegistry22, scope23, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap63);
        java.util.Map<java.lang.String, java.lang.String> strMap65 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry6, scope7, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = closureCodingConvention0.extractClassNameIfRequire(node67, node68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.abstractMethod" + "'", str27, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "goog.global" + "'", str28, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(delegateRelationship33);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("");
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean13 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        boolean boolean16 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        boolean boolean19 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        java.lang.String str7 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean9 = closureCodingConvention0.isPrivate("goog.global");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention7.isOptionalParameter(node8);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.jscomp.Scope scope11 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention12 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention12.isOptionalParameter(node13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray17 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList18 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList18, objectTypeArray17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        closureCodingConvention12.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList18, strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry10, scope11, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList18, strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList18, strMap24);
        boolean boolean27 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection28 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection29 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectTypeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection28);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection29);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection1 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = closureCodingConvention0.extractClassNameIfProvide(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection1);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention5 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention5.isOptionalParameter(node6);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention5.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap15);
        com.google.javascript.rhino.Node node17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node17, strMap18);
        java.lang.String str20 = closureCodingConvention0.getGlobalObject();
        boolean boolean22 = closureCodingConvention0.isConstant("hi!");
        boolean boolean24 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType26 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType27 = null;
        closureCodingConvention0.applySubclassRelationship(functionType25, functionType26, subclassType27);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType32 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType33 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType29, objectType30, objectType31, functionType32, functionType33);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType36 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType37 = null;
        closureCodingConvention0.applySubclassRelationship(functionType35, functionType36, subclassType37);
        com.google.javascript.rhino.Node node39 = null;
        boolean boolean40 = closureCodingConvention0.isVarArgsParameter(node39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean6 = closureCodingConvention0.isExported("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention11.isOptionalParameter(node12);
        java.lang.String str14 = closureCodingConvention11.getAbstractMethodName();
        java.lang.String str15 = closureCodingConvention11.getGlobalObject();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention11.getDelegateRelationship(node16);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.jscomp.Scope scope19 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention20 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = closureCodingConvention20.isOptionalParameter(node21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.jscomp.Scope scope24 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray25 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList26 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, objectTypeArray25);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        closureCodingConvention20.defineDelegateProxyPrototypeProperties(jSTypeRegistry23, scope24, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap28);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        closureCodingConvention11.defineDelegateProxyPrototypeProperties(jSTypeRegistry18, scope19, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap32);
        java.lang.String str34 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType38 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType39 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType35, objectType36, objectType37, functionType38, functionType39);
        java.lang.String str41 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "goog.global" + "'", str34, "goog.global");
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        boolean boolean4 = closureCodingConvention0.isConstant("goog.global");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("goog.global");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention7.isOptionalParameter(node8);
        java.lang.String str10 = closureCodingConvention7.getAbstractMethodName();
        java.lang.String str11 = closureCodingConvention7.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention7.getAssertionFunctions();
        boolean boolean14 = closureCodingConvention7.isConstant("goog.global");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship16 = closureCodingConvention7.getDelegateRelationship(node15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        closureCodingConvention7.applyDelegateRelationship(objectType17, objectType18, objectType19, functionType20, functionType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.jscomp.Scope scope24 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention25 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = closureCodingConvention25.isOptionalParameter(node26);
        boolean boolean29 = closureCodingConvention25.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.jscomp.Scope scope31 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention32 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node33 = null;
        boolean boolean34 = closureCodingConvention32.isOptionalParameter(node33);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = null;
        com.google.javascript.jscomp.Scope scope36 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray37 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList38, objectTypeArray37);
        java.util.Map<java.lang.String, java.lang.String> strMap40 = null;
        closureCodingConvention32.defineDelegateProxyPrototypeProperties(jSTypeRegistry35, scope36, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList38, strMap40);
        java.util.Map<java.lang.String, java.lang.String> strMap42 = null;
        closureCodingConvention25.defineDelegateProxyPrototypeProperties(jSTypeRegistry30, scope31, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList38, strMap42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry23, scope24, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList38, strMap44);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList38, strMap46);
        java.lang.Class<?> wildcardClass48 = objectTypeList38.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(delegateRelationship16);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind8 = closureCodingConvention0.describeFunctionBind(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isExported("hi!");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean11 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        boolean boolean19 = closureCodingConvention0.isSuperClassReference("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean12 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType13, objectType14, objectType15, functionType16, functionType17);
        boolean boolean21 = closureCodingConvention0.isExported("goog.global", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.jscomp.Scope scope23 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention24 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = closureCodingConvention24.isOptionalParameter(node25);
        java.lang.String str27 = closureCodingConvention24.getAbstractMethodName();
        java.lang.String str28 = closureCodingConvention24.getGlobalObject();
        boolean boolean30 = closureCodingConvention24.isExported("goog.global");
        boolean boolean32 = closureCodingConvention24.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.jscomp.Scope scope34 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention35 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = closureCodingConvention35.isOptionalParameter(node36);
        java.lang.String str38 = closureCodingConvention35.getAbstractMethodName();
        java.lang.String str39 = closureCodingConvention35.getGlobalObject();
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship41 = closureCodingConvention35.getDelegateRelationship(node40);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = null;
        com.google.javascript.jscomp.Scope scope43 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention44 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node45 = null;
        boolean boolean46 = closureCodingConvention44.isOptionalParameter(node45);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = null;
        com.google.javascript.jscomp.Scope scope48 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray49 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList50 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList50, objectTypeArray49);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = null;
        closureCodingConvention44.defineDelegateProxyPrototypeProperties(jSTypeRegistry47, scope48, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList50, strMap52);
        java.util.Map<java.lang.String, java.lang.String> strMap54 = null;
        closureCodingConvention35.defineDelegateProxyPrototypeProperties(jSTypeRegistry42, scope43, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList50, strMap54);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry33, scope34, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList50, strMap56);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection58 = closureCodingConvention24.getAssertionFunctions();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = null;
        com.google.javascript.jscomp.Scope scope60 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention61 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = closureCodingConvention61.isOptionalParameter(node62);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = null;
        com.google.javascript.jscomp.Scope scope65 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray66 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList67, objectTypeArray66);
        java.util.Map<java.lang.String, java.lang.String> strMap69 = null;
        closureCodingConvention61.defineDelegateProxyPrototypeProperties(jSTypeRegistry64, scope65, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList67, strMap69);
        java.util.Map<java.lang.String, java.lang.String> strMap71 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry59, scope60, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList67, strMap71);
        java.util.Map<java.lang.String, java.lang.String> strMap73 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry22, scope23, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList67, strMap73);
        boolean boolean76 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.rhino.Node node78 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str79 = closureCodingConvention0.extractClassNameIfRequire(node77, node78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.abstractMethod" + "'", str27, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "goog.global" + "'", str28, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "goog.abstractMethod" + "'", str38, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "goog.global" + "'", str39, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectTypeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("");
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.jscomp.Scope scope15 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention16 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean18 = closureCodingConvention16.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection19 = closureCodingConvention16.getAssertionFunctions();
        java.lang.String str20 = closureCodingConvention16.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.jscomp.Scope scope22 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention23 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention23.isOptionalParameter(node24);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.jscomp.Scope scope27 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention28 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node29 = null;
        boolean boolean30 = closureCodingConvention28.isOptionalParameter(node29);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.jscomp.Scope scope32 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray33 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList34 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList34, objectTypeArray33);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
        closureCodingConvention28.defineDelegateProxyPrototypeProperties(jSTypeRegistry31, scope32, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList34, strMap36);
        java.util.Map<java.lang.String, java.lang.String> strMap38 = null;
        closureCodingConvention23.defineDelegateProxyPrototypeProperties(jSTypeRegistry26, scope27, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList34, strMap38);
        java.util.Map<java.lang.String, java.lang.String> strMap40 = null;
        closureCodingConvention16.defineDelegateProxyPrototypeProperties(jSTypeRegistry21, scope22, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList34, strMap40);
        java.util.Map<java.lang.String, java.lang.String> strMap42 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry14, scope15, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList34, strMap42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast46 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal44, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectTypeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isExported("hi!");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean11 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        boolean boolean19 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        boolean boolean21 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean23 = closureCodingConvention0.isPrivate("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        boolean boolean11 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.jscomp.Scope scope7 = null;
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry6, scope7, objectTypeList8, strMap9);
        boolean boolean12 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean14 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean17 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = closureCodingConvention0.isOptionalParameter(node18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("hi!");
        java.lang.String str11 = closureCodingConvention0.getGlobalObject();
        boolean boolean13 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList15 = closureCodingConvention0.identifyTypeDeclarationCall(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.jscomp.Scope scope7 = null;
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry6, scope7, objectTypeList8, strMap9);
        boolean boolean12 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean14 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str16 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean18 = closureCodingConvention0.isExported("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.abstractMethod" + "'", str16, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isOptionalParameter(node12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention5 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention5.isOptionalParameter(node6);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention5.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap15);
        com.google.javascript.rhino.Node node17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node17, strMap18);
        java.lang.String str20 = closureCodingConvention0.getGlobalObject();
        boolean boolean22 = closureCodingConvention0.isConstant("hi!");
        java.lang.String str23 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection24 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str25 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.global" + "'", str25, "goog.global");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean17 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node18 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node18, strMap19);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.jscomp.Scope scope22 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention23 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention23.isOptionalParameter(node24);
        boolean boolean27 = closureCodingConvention23.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = closureCodingConvention23.isOptionalParameter(node28);
        boolean boolean31 = closureCodingConvention23.isConstantKey("hi!");
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = closureCodingConvention23.isVarArgsParameter(node32);
        java.lang.String str34 = closureCodingConvention23.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection35 = closureCodingConvention23.getAssertionFunctions();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.jscomp.Scope scope37 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention38 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node39 = null;
        boolean boolean40 = closureCodingConvention38.isOptionalParameter(node39);
        java.lang.String str41 = closureCodingConvention38.getAbstractMethodName();
        java.lang.String str42 = closureCodingConvention38.getGlobalObject();
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship44 = closureCodingConvention38.getDelegateRelationship(node43);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = null;
        com.google.javascript.jscomp.Scope scope46 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention47 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node48 = null;
        boolean boolean49 = closureCodingConvention47.isOptionalParameter(node48);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.jscomp.Scope scope51 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray52 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList53 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList53, objectTypeArray52);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        closureCodingConvention47.defineDelegateProxyPrototypeProperties(jSTypeRegistry50, scope51, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList53, strMap55);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        closureCodingConvention38.defineDelegateProxyPrototypeProperties(jSTypeRegistry45, scope46, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList53, strMap57);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        closureCodingConvention23.defineDelegateProxyPrototypeProperties(jSTypeRegistry36, scope37, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList53, strMap59);
        java.util.Map<java.lang.String, java.lang.String> strMap61 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry21, scope22, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList53, strMap61);
        boolean boolean65 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean67 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.Node node68 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = closureCodingConvention0.isPropertyTestFunction(node68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "goog.abstractMethod" + "'", str41, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "goog.global" + "'", str42, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectTypeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        boolean boolean9 = closureCodingConvention0.isExported("goog.exportSymbol");
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        boolean boolean17 = closureCodingConvention0.isValidEnumKey("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isExported("hi!");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean11 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship15 = closureCodingConvention0.getDelegateRelationship(node14);
        boolean boolean17 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertNull(delegateRelationship15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        java.lang.String str10 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.abstractMethod" + "'", str7, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.jscomp.Scope scope7 = null;
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry6, scope7, objectTypeList8, strMap9);
        boolean boolean12 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean14 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection16 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean18 = closureCodingConvention0.isConstantKey("goog.global");
        boolean boolean20 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = closureCodingConvention0.getSingletonGetterClassName(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isExported("hi!");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str10 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean13 = closureCodingConvention0.isExported("", false);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.Node node16 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node16, strMap17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("");
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean13 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = closureCodingConvention0.getSingletonGetterClassName(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isOptionalParameter(node8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        boolean boolean15 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        boolean boolean17 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        java.lang.String str18 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean5 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean9 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        boolean boolean14 = closureCodingConvention0.isConstant("goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isOptionalParameter(node8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        boolean boolean15 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.jscomp.Scope scope17 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention18 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = closureCodingConvention18.isOptionalParameter(node19);
        java.lang.String str21 = closureCodingConvention18.getAbstractMethodName();
        java.lang.String str22 = closureCodingConvention18.getGlobalObject();
        boolean boolean24 = closureCodingConvention18.isExported("goog.global");
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship26 = closureCodingConvention18.getDelegateRelationship(node25);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.jscomp.Scope scope28 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention29 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = closureCodingConvention29.isOptionalParameter(node30);
        java.lang.String str32 = closureCodingConvention29.getAbstractMethodName();
        java.lang.String str33 = closureCodingConvention29.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection34 = closureCodingConvention29.getAssertionFunctions();
        boolean boolean36 = closureCodingConvention29.isConstant("goog.global");
        boolean boolean38 = closureCodingConvention29.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType39 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType40 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType41 = null;
        closureCodingConvention29.applySubclassRelationship(functionType39, functionType40, subclassType41);
        boolean boolean44 = closureCodingConvention29.isSuperClassReference("goog.global");
        boolean boolean47 = closureCodingConvention29.isExported("hi!", false);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection48 = closureCodingConvention29.getAssertionFunctions();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = null;
        com.google.javascript.jscomp.Scope scope50 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention51 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node52 = null;
        boolean boolean53 = closureCodingConvention51.isOptionalParameter(node52);
        java.lang.String str54 = closureCodingConvention51.getAbstractMethodName();
        java.lang.String str55 = closureCodingConvention51.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection56 = closureCodingConvention51.getAssertionFunctions();
        boolean boolean58 = closureCodingConvention51.isConstant("goog.global");
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship60 = closureCodingConvention51.getDelegateRelationship(node59);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType64 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType65 = null;
        closureCodingConvention51.applyDelegateRelationship(objectType61, objectType62, objectType63, functionType64, functionType65);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = null;
        com.google.javascript.jscomp.Scope scope68 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention69 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node70 = null;
        boolean boolean71 = closureCodingConvention69.isOptionalParameter(node70);
        boolean boolean73 = closureCodingConvention69.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = null;
        com.google.javascript.jscomp.Scope scope75 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention76 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node77 = null;
        boolean boolean78 = closureCodingConvention76.isOptionalParameter(node77);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = null;
        com.google.javascript.jscomp.Scope scope80 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray81 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList82 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, objectTypeArray81);
        java.util.Map<java.lang.String, java.lang.String> strMap84 = null;
        closureCodingConvention76.defineDelegateProxyPrototypeProperties(jSTypeRegistry79, scope80, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap84);
        java.util.Map<java.lang.String, java.lang.String> strMap86 = null;
        closureCodingConvention69.defineDelegateProxyPrototypeProperties(jSTypeRegistry74, scope75, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap86);
        java.util.Map<java.lang.String, java.lang.String> strMap88 = null;
        closureCodingConvention51.defineDelegateProxyPrototypeProperties(jSTypeRegistry67, scope68, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap88);
        java.util.Map<java.lang.String, java.lang.String> strMap90 = null;
        closureCodingConvention29.defineDelegateProxyPrototypeProperties(jSTypeRegistry49, scope50, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap90);
        java.util.Map<java.lang.String, java.lang.String> strMap92 = null;
        closureCodingConvention18.defineDelegateProxyPrototypeProperties(jSTypeRegistry27, scope28, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap92);
        java.util.Map<java.lang.String, java.lang.String> strMap94 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry16, scope17, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap94);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.abstractMethod" + "'", str21, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.global" + "'", str22, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(delegateRelationship26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "goog.abstractMethod" + "'", str32, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "goog.global" + "'", str33, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "goog.abstractMethod" + "'", str54, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "goog.global" + "'", str55, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(delegateRelationship60);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objectTypeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean14 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType15, objectType16, objectType17, functionType18, functionType19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship22 = closureCodingConvention0.getDelegateRelationship(node21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(delegateRelationship22);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        java.lang.String str7 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean11 = closureCodingConvention0.isSuperClassReference("goog.global");
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.abstractMethod" + "'", str7, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        java.lang.String str7 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str8 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportProperty" + "'", str8, "goog.exportProperty");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isVarArgsParameter(node4);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.jscomp.Scope scope7 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention8 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention8.isOptionalParameter(node9);
        java.lang.String str11 = closureCodingConvention8.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention8.getGlobalObject();
        com.google.javascript.rhino.Node node13 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        closureCodingConvention8.checkForCallingConventionDefiningCalls(node13, strMap14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention8.getDelegateRelationship(node16);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.jscomp.Scope scope19 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention20 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = closureCodingConvention20.isOptionalParameter(node21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.jscomp.Scope scope24 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray25 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList26 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, objectTypeArray25);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        closureCodingConvention20.defineDelegateProxyPrototypeProperties(jSTypeRegistry23, scope24, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap28);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        closureCodingConvention8.defineDelegateProxyPrototypeProperties(jSTypeRegistry18, scope19, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry6, scope7, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap32);
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = closureCodingConvention0.isOptionalParameter(node34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.global");
        java.lang.String str16 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship18 = closureCodingConvention0.getDelegateRelationship(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = closureCodingConvention0.extractClassNameIfRequire(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship18);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        boolean boolean14 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean17 = closureCodingConvention0.isExported("");
        boolean boolean19 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention0.isVarArgsParameter(node20);
        java.lang.String str22 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.abstractMethod" + "'", str22, "goog.abstractMethod");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean5 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.exportSymbol");
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        boolean boolean11 = closureCodingConvention0.isPrivate("hi!");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = closureCodingConvention0.extractClassNameIfProvide(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        java.lang.String str10 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        boolean boolean14 = closureCodingConvention0.isExported("");
        boolean boolean17 = closureCodingConvention0.isExported("goog.global", false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship19 = closureCodingConvention0.getDelegateRelationship(node18);
        boolean boolean21 = closureCodingConvention0.isConstantKey("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(delegateRelationship19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isOptionalParameter(node8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        boolean boolean15 = closureCodingConvention0.isExported("goog.exportSymbol");
        boolean boolean17 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType18, objectType19, objectType20, functionType21, functionType22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention0.isVarArgsParameter(node24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType15, functionType16, objectType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean6 = closureCodingConvention0.isExported("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention11.isOptionalParameter(node12);
        java.lang.String str14 = closureCodingConvention11.getAbstractMethodName();
        java.lang.String str15 = closureCodingConvention11.getGlobalObject();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention11.getDelegateRelationship(node16);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.jscomp.Scope scope19 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention20 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = closureCodingConvention20.isOptionalParameter(node21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.jscomp.Scope scope24 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray25 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList26 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, objectTypeArray25);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        closureCodingConvention20.defineDelegateProxyPrototypeProperties(jSTypeRegistry23, scope24, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap28);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        closureCodingConvention11.defineDelegateProxyPrototypeProperties(jSTypeRegistry18, scope19, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap32);
        java.lang.String str34 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str35 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean38 = closureCodingConvention0.isExported("", true);
        java.lang.String str39 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = closureCodingConvention0.extractClassNameIfRequire(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "goog.exportSymbol" + "'", str34, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "goog.exportSymbol" + "'", str35, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "goog.exportProperty" + "'", str39, "goog.exportProperty");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention11.isOptionalParameter(node12);
        java.lang.String str14 = closureCodingConvention11.getAbstractMethodName();
        java.lang.String str15 = closureCodingConvention11.getGlobalObject();
        com.google.javascript.rhino.Node node16 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention11.checkForCallingConventionDefiningCalls(node16, strMap17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship20 = closureCodingConvention11.getDelegateRelationship(node19);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.jscomp.Scope scope22 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention23 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention23.isOptionalParameter(node24);
        java.lang.String str26 = closureCodingConvention23.getAbstractMethodName();
        java.lang.String str27 = closureCodingConvention23.getGlobalObject();
        boolean boolean29 = closureCodingConvention23.isExported("goog.global");
        boolean boolean31 = closureCodingConvention23.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = null;
        com.google.javascript.jscomp.Scope scope33 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention34 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node35 = null;
        boolean boolean36 = closureCodingConvention34.isOptionalParameter(node35);
        java.lang.String str37 = closureCodingConvention34.getAbstractMethodName();
        java.lang.String str38 = closureCodingConvention34.getGlobalObject();
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship40 = closureCodingConvention34.getDelegateRelationship(node39);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = null;
        com.google.javascript.jscomp.Scope scope42 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention43 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node44 = null;
        boolean boolean45 = closureCodingConvention43.isOptionalParameter(node44);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.jscomp.Scope scope47 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray48 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList49 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList49, objectTypeArray48);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        closureCodingConvention43.defineDelegateProxyPrototypeProperties(jSTypeRegistry46, scope47, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList49, strMap51);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        closureCodingConvention34.defineDelegateProxyPrototypeProperties(jSTypeRegistry41, scope42, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList49, strMap53);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        closureCodingConvention23.defineDelegateProxyPrototypeProperties(jSTypeRegistry32, scope33, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList49, strMap55);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        closureCodingConvention11.defineDelegateProxyPrototypeProperties(jSTypeRegistry21, scope22, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList49, strMap57);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList49, strMap59);
        java.lang.String str61 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship63 = closureCodingConvention0.getDelegateRelationship(node62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "goog.abstractMethod" + "'", str26, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.global" + "'", str27, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "goog.abstractMethod" + "'", str37, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "goog.global" + "'", str38, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectTypeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "goog.exportSymbol" + "'", str61, "goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship63);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("");
        java.lang.String str11 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention15 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention15.isOptionalParameter(node16);
        boolean boolean19 = closureCodingConvention15.isSuperClassReference("hi!");
        boolean boolean21 = closureCodingConvention15.isValidEnumKey("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.jscomp.Scope scope23 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention24 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = closureCodingConvention24.isOptionalParameter(node25);
        java.lang.String str27 = closureCodingConvention24.getAbstractMethodName();
        java.lang.String str28 = closureCodingConvention24.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection29 = closureCodingConvention24.getAssertionFunctions();
        boolean boolean31 = closureCodingConvention24.isConstant("goog.global");
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship33 = closureCodingConvention24.getDelegateRelationship(node32);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType37 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType38 = null;
        closureCodingConvention24.applyDelegateRelationship(objectType34, objectType35, objectType36, functionType37, functionType38);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = null;
        com.google.javascript.jscomp.Scope scope41 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention42 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node43 = null;
        boolean boolean44 = closureCodingConvention42.isOptionalParameter(node43);
        boolean boolean46 = closureCodingConvention42.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = null;
        com.google.javascript.jscomp.Scope scope48 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention49 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node50 = null;
        boolean boolean51 = closureCodingConvention49.isOptionalParameter(node50);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = null;
        com.google.javascript.jscomp.Scope scope53 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray54 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, objectTypeArray54);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        closureCodingConvention49.defineDelegateProxyPrototypeProperties(jSTypeRegistry52, scope53, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap57);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        closureCodingConvention42.defineDelegateProxyPrototypeProperties(jSTypeRegistry47, scope48, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap59);
        java.util.Map<java.lang.String, java.lang.String> strMap61 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry40, scope41, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap61);
        java.util.Map<java.lang.String, java.lang.String> strMap63 = null;
        closureCodingConvention15.defineDelegateProxyPrototypeProperties(jSTypeRegistry22, scope23, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap63);
        java.util.Map<java.lang.String, java.lang.String> strMap65 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap65);
        boolean boolean69 = closureCodingConvention0.isExported("goog.exportProperty", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportSymbol" + "'", str11, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.abstractMethod" + "'", str27, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "goog.global" + "'", str28, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(delegateRelationship33);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertNull(delegateRelationship10);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("");
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection13 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean15 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        com.google.javascript.rhino.Node node16 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node16, strMap17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = closureCodingConvention0.extractClassNameIfProvide(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        java.lang.String str14 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean16 = closureCodingConvention0.isExported("");
        boolean boolean18 = closureCodingConvention0.isConstant("goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.exportSymbol" + "'", str14, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention5 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention5.isOptionalParameter(node6);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention5.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap15);
        com.google.javascript.rhino.Node node17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node17, strMap18);
        java.lang.String str20 = closureCodingConvention0.getGlobalObject();
        java.lang.String str21 = closureCodingConvention0.getExportPropertyFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection22 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean25 = closureCodingConvention0.isExported("goog.exportProperty", true);
        boolean boolean27 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.jscomp.Scope scope29 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention30 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node31 = null;
        boolean boolean32 = closureCodingConvention30.isOptionalParameter(node31);
        boolean boolean34 = closureCodingConvention30.isSuperClassReference("hi!");
        boolean boolean36 = closureCodingConvention30.isSuperClassReference("goog.global");
        boolean boolean38 = closureCodingConvention30.isConstant("goog.abstractMethod");
        boolean boolean40 = closureCodingConvention30.isValidEnumKey("hi!");
        boolean boolean42 = closureCodingConvention30.isSuperClassReference("goog.global");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.jscomp.Scope scope44 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention45 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean47 = closureCodingConvention45.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection48 = closureCodingConvention45.getAssertionFunctions();
        java.lang.String str49 = closureCodingConvention45.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.jscomp.Scope scope51 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention52 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = closureCodingConvention52.isOptionalParameter(node53);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.jscomp.Scope scope56 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention57 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node58 = null;
        boolean boolean59 = closureCodingConvention57.isOptionalParameter(node58);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = null;
        com.google.javascript.jscomp.Scope scope61 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray62 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList63 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList63, objectTypeArray62);
        java.util.Map<java.lang.String, java.lang.String> strMap65 = null;
        closureCodingConvention57.defineDelegateProxyPrototypeProperties(jSTypeRegistry60, scope61, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList63, strMap65);
        java.util.Map<java.lang.String, java.lang.String> strMap67 = null;
        closureCodingConvention52.defineDelegateProxyPrototypeProperties(jSTypeRegistry55, scope56, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList63, strMap67);
        java.util.Map<java.lang.String, java.lang.String> strMap69 = null;
        closureCodingConvention45.defineDelegateProxyPrototypeProperties(jSTypeRegistry50, scope51, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList63, strMap69);
        java.util.Map<java.lang.String, java.lang.String> strMap71 = null;
        closureCodingConvention30.defineDelegateProxyPrototypeProperties(jSTypeRegistry43, scope44, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList63, strMap71);
        java.util.Map<java.lang.String, java.lang.String> strMap73 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry28, scope29, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList63, strMap73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.exportProperty" + "'", str21, "goog.exportProperty");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "goog.global" + "'", str49, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectTypeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention5 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention5.isOptionalParameter(node6);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention5.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap15);
        com.google.javascript.rhino.Node node17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node17, strMap18);
        boolean boolean21 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str22 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.global" + "'", str22, "goog.global");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isConstant("");
        boolean boolean16 = closureCodingConvention0.isExported("goog.global", false);
        java.lang.String str17 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.exportProperty" + "'", str17, "goog.exportProperty");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection1 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", true);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = closureCodingConvention0.isPropertyTestFunction(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection1);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean6 = closureCodingConvention0.isExported("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention11.isOptionalParameter(node12);
        java.lang.String str14 = closureCodingConvention11.getAbstractMethodName();
        java.lang.String str15 = closureCodingConvention11.getGlobalObject();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention11.getDelegateRelationship(node16);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.jscomp.Scope scope19 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention20 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = closureCodingConvention20.isOptionalParameter(node21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.jscomp.Scope scope24 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray25 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList26 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, objectTypeArray25);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        closureCodingConvention20.defineDelegateProxyPrototypeProperties(jSTypeRegistry23, scope24, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap28);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        closureCodingConvention11.defineDelegateProxyPrototypeProperties(jSTypeRegistry18, scope19, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap32);
        java.lang.String str34 = closureCodingConvention0.getGlobalObject();
        boolean boolean36 = closureCodingConvention0.isSuperClassReference("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "goog.global" + "'", str34, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isVarArgsParameter(node14);
        boolean boolean17 = closureCodingConvention0.isExported("goog.exportSymbol");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType18, functionType19, objectType20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("hi!");
        boolean boolean6 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean8 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind10 = closureCodingConvention0.describeFunctionBind(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention7.isOptionalParameter(node8);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.jscomp.Scope scope11 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray12 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, objectTypeArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry10, scope11, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, strMap15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, strMap17);
        java.lang.String str19 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship21 = closureCodingConvention0.getDelegateRelationship(node20);
        boolean boolean23 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention0.isOptionalParameter(node24);
        boolean boolean27 = closureCodingConvention0.isConstant("goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectTypeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.abstractMethod" + "'", str19, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention7.isOptionalParameter(node8);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.jscomp.Scope scope11 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray12 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, objectTypeArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry10, scope11, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, strMap15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, strMap17);
        java.lang.String str19 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType22 = null;
        closureCodingConvention0.applySubclassRelationship(functionType20, functionType21, subclassType22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectTypeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.exportProperty" + "'", str19, "goog.exportProperty");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        boolean boolean14 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention0.isVarArgsParameter(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind19 = closureCodingConvention0.describeFunctionBind(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        java.lang.String str10 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.abstractMethod" + "'", str7, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportSymbol" + "'", str10, "goog.exportSymbol");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.global");
        java.lang.String str16 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship18 = closureCodingConvention0.getDelegateRelationship(node17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = closureCodingConvention0.isPropertyTestFunction(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship18);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str13 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str14 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType15, functionType16, objectType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.exportProperty" + "'", str14, "goog.exportProperty");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.jscomp.Scope scope7 = null;
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry6, scope7, objectTypeList8, strMap9);
        boolean boolean12 = closureCodingConvention0.isConstant("goog.exportSymbol");
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isOptionalParameter(node13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast17 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean12 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str16 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention19 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention19.isOptionalParameter(node20);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.jscomp.Scope scope23 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray24 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList25, objectTypeArray24);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        closureCodingConvention19.defineDelegateProxyPrototypeProperties(jSTypeRegistry22, scope23, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList25, strMap27);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry17, scope18, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList25, strMap29);
        com.google.javascript.rhino.Node node31 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node31, strMap32);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = closureCodingConvention0.getSingletonGetterClassName(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.abstractMethod" + "'", str16, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        boolean boolean4 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        boolean boolean9 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        boolean boolean11 = closureCodingConvention0.isExported("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean6 = closureCodingConvention0.isExported("goog.global");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship8 = closureCodingConvention0.getDelegateRelationship(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship12 = closureCodingConvention0.getDelegateRelationship(node11);
        boolean boolean14 = closureCodingConvention0.isConstant("goog.exportProperty");
        boolean boolean16 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = closureCodingConvention0.extractClassNameIfRequire(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(delegateRelationship8);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertNull(delegateRelationship12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray5 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList6 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList6, objectTypeArray5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList6, strMap8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isConstantKey("");
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast17 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectTypeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean5 = closureCodingConvention0.isConstant("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        boolean boolean14 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        java.lang.String str15 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention0.isOptionalParameter(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList19 = closureCodingConvention0.identifyTypeDeclarationCall(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.abstractMethod" + "'", str15, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("goog.global");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention15 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean17 = closureCodingConvention15.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection18 = closureCodingConvention15.getAssertionFunctions();
        java.lang.String str19 = closureCodingConvention15.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.jscomp.Scope scope21 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention22 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = closureCodingConvention22.isOptionalParameter(node23);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention27 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = closureCodingConvention27.isOptionalParameter(node28);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.jscomp.Scope scope31 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray32 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, objectTypeArray32);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        closureCodingConvention27.defineDelegateProxyPrototypeProperties(jSTypeRegistry30, scope31, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        closureCodingConvention22.defineDelegateProxyPrototypeProperties(jSTypeRegistry25, scope26, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap37);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        closureCodingConvention15.defineDelegateProxyPrototypeProperties(jSTypeRegistry20, scope21, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap39);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap41);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType44 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType45 = null;
        closureCodingConvention0.applySubclassRelationship(functionType43, functionType44, subclassType45);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention7.isOptionalParameter(node8);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.jscomp.Scope scope11 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray12 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, objectTypeArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry10, scope11, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, strMap15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, strMap17);
        com.google.javascript.rhino.Node node19 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node19, strMap20);
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType24 = null;
        closureCodingConvention0.applySubclassRelationship(functionType22, functionType23, subclassType24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = closureCodingConvention0.getSingletonGetterClassName(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectTypeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean17 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node18 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node18, strMap19);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.jscomp.Scope scope22 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention23 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention23.isOptionalParameter(node24);
        boolean boolean27 = closureCodingConvention23.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = closureCodingConvention23.isOptionalParameter(node28);
        boolean boolean31 = closureCodingConvention23.isConstantKey("hi!");
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = closureCodingConvention23.isVarArgsParameter(node32);
        java.lang.String str34 = closureCodingConvention23.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection35 = closureCodingConvention23.getAssertionFunctions();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.jscomp.Scope scope37 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention38 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node39 = null;
        boolean boolean40 = closureCodingConvention38.isOptionalParameter(node39);
        java.lang.String str41 = closureCodingConvention38.getAbstractMethodName();
        java.lang.String str42 = closureCodingConvention38.getGlobalObject();
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship44 = closureCodingConvention38.getDelegateRelationship(node43);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = null;
        com.google.javascript.jscomp.Scope scope46 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention47 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node48 = null;
        boolean boolean49 = closureCodingConvention47.isOptionalParameter(node48);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.jscomp.Scope scope51 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray52 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList53 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList53, objectTypeArray52);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        closureCodingConvention47.defineDelegateProxyPrototypeProperties(jSTypeRegistry50, scope51, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList53, strMap55);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        closureCodingConvention38.defineDelegateProxyPrototypeProperties(jSTypeRegistry45, scope46, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList53, strMap57);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        closureCodingConvention23.defineDelegateProxyPrototypeProperties(jSTypeRegistry36, scope37, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList53, strMap59);
        java.util.Map<java.lang.String, java.lang.String> strMap61 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry21, scope22, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList53, strMap61);
        boolean boolean65 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean67 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.jstype.FunctionType functionType68 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType69 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType70 = null;
        closureCodingConvention0.applySubclassRelationship(functionType68, functionType69, subclassType70);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "goog.abstractMethod" + "'", str41, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "goog.global" + "'", str42, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectTypeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean17 = closureCodingConvention0.isConstantKey("");
        boolean boolean19 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention0.isVarArgsParameter(node20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        boolean boolean12 = closureCodingConvention0.isConstant("goog.global");
        java.lang.String str13 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.jscomp.Scope scope7 = null;
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry6, scope7, objectTypeList8, strMap9);
        boolean boolean12 = closureCodingConvention0.isExported("goog.global");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention7.isOptionalParameter(node8);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.jscomp.Scope scope11 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray12 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, objectTypeArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry10, scope11, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, strMap15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList13, strMap17);
        java.lang.String str19 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship21 = closureCodingConvention0.getDelegateRelationship(node20);
        boolean boolean23 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind25 = closureCodingConvention0.describeFunctionBind(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectTypeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.abstractMethod" + "'", str19, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention5 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention5.isOptionalParameter(node6);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention5.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap15);
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean19 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        java.lang.String str20 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str21 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType24 = null;
        closureCodingConvention0.applySubclassRelationship(functionType22, functionType23, subclassType24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.abstractMethod" + "'", str21, "goog.abstractMethod");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("");
        boolean boolean13 = closureCodingConvention0.isExported("goog.exportProperty", true);
        java.lang.String str14 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship16 = closureCodingConvention0.getClassesDefinedByCall(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.global" + "'", str14, "goog.global");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        java.lang.String str7 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node8, strMap9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("goog.global");
        java.lang.String str13 = closureCodingConvention0.getGlobalObject();
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean17 = closureCodingConvention0.isConstant("goog.exportSymbol");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = closureCodingConvention0.extractClassNameIfRequire(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        java.lang.String str10 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        boolean boolean14 = closureCodingConvention0.isPrivate("goog.global");
        boolean boolean16 = closureCodingConvention0.isConstantKey("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention5 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention5.isOptionalParameter(node6);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention5.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap15);
        com.google.javascript.rhino.Node node17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node17, strMap18);
        java.lang.String str20 = closureCodingConvention0.getGlobalObject();
        boolean boolean22 = closureCodingConvention0.isConstant("hi!");
        boolean boolean24 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType26 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType27 = null;
        closureCodingConvention0.applySubclassRelationship(functionType25, functionType26, subclassType27);
        java.lang.String str29 = closureCodingConvention0.getGlobalObject();
        java.lang.String str30 = closureCodingConvention0.getExportSymbolFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection31 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "goog.global" + "'", str29, "goog.global");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "goog.exportSymbol" + "'", str30, "goog.exportSymbol");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection31);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean12 = closureCodingConvention0.isExported("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship18 = closureCodingConvention0.getDelegateRelationship(node17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(delegateRelationship18);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("hi!");
        boolean boolean6 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean8 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        boolean boolean10 = closureCodingConvention0.isPrivate("goog.global");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = closureCodingConvention0.extractClassNameIfProvide(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean5 = closureCodingConvention0.isConstant("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        boolean boolean14 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        java.lang.String str15 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention0.isOptionalParameter(node16);
        boolean boolean19 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        java.lang.String str20 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean6 = closureCodingConvention0.isExported("", true);
        java.lang.String str7 = closureCodingConvention0.getGlobalObject();
        java.lang.String str8 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean10 = closureCodingConvention0.isExported("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = null;
        closureCodingConvention0.applySubclassRelationship(functionType11, functionType12, subclassType13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.global" + "'", str7, "goog.global");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportSymbol" + "'", str8, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType4 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType1, objectType2, objectType3, functionType4, functionType5);
        java.lang.String str7 = closureCodingConvention0.getGlobalObject();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.global" + "'", str7, "goog.global");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        boolean boolean10 = closureCodingConvention0.isConstant("");
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isOptionalParameter(node12);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.jscomp.Scope scope15 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention16 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = closureCodingConvention16.isOptionalParameter(node17);
        java.lang.String str19 = closureCodingConvention16.getAbstractMethodName();
        java.lang.String str20 = closureCodingConvention16.getGlobalObject();
        boolean boolean22 = closureCodingConvention16.isExported("goog.global");
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship24 = closureCodingConvention16.getDelegateRelationship(node23);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention27 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = closureCodingConvention27.isOptionalParameter(node28);
        java.lang.String str30 = closureCodingConvention27.getAbstractMethodName();
        java.lang.String str31 = closureCodingConvention27.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection32 = closureCodingConvention27.getAssertionFunctions();
        boolean boolean34 = closureCodingConvention27.isConstant("goog.global");
        boolean boolean36 = closureCodingConvention27.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType37 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType38 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType39 = null;
        closureCodingConvention27.applySubclassRelationship(functionType37, functionType38, subclassType39);
        boolean boolean42 = closureCodingConvention27.isSuperClassReference("goog.global");
        boolean boolean45 = closureCodingConvention27.isExported("hi!", false);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection46 = closureCodingConvention27.getAssertionFunctions();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = null;
        com.google.javascript.jscomp.Scope scope48 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention49 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node50 = null;
        boolean boolean51 = closureCodingConvention49.isOptionalParameter(node50);
        java.lang.String str52 = closureCodingConvention49.getAbstractMethodName();
        java.lang.String str53 = closureCodingConvention49.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection54 = closureCodingConvention49.getAssertionFunctions();
        boolean boolean56 = closureCodingConvention49.isConstant("goog.global");
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship58 = closureCodingConvention49.getDelegateRelationship(node57);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType62 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType63 = null;
        closureCodingConvention49.applyDelegateRelationship(objectType59, objectType60, objectType61, functionType62, functionType63);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = null;
        com.google.javascript.jscomp.Scope scope66 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention67 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node68 = null;
        boolean boolean69 = closureCodingConvention67.isOptionalParameter(node68);
        boolean boolean71 = closureCodingConvention67.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = null;
        com.google.javascript.jscomp.Scope scope73 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention74 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node75 = null;
        boolean boolean76 = closureCodingConvention74.isOptionalParameter(node75);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = null;
        com.google.javascript.jscomp.Scope scope78 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray79 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList80 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, objectTypeArray79);
        java.util.Map<java.lang.String, java.lang.String> strMap82 = null;
        closureCodingConvention74.defineDelegateProxyPrototypeProperties(jSTypeRegistry77, scope78, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, strMap82);
        java.util.Map<java.lang.String, java.lang.String> strMap84 = null;
        closureCodingConvention67.defineDelegateProxyPrototypeProperties(jSTypeRegistry72, scope73, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, strMap84);
        java.util.Map<java.lang.String, java.lang.String> strMap86 = null;
        closureCodingConvention49.defineDelegateProxyPrototypeProperties(jSTypeRegistry65, scope66, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, strMap86);
        java.util.Map<java.lang.String, java.lang.String> strMap88 = null;
        closureCodingConvention27.defineDelegateProxyPrototypeProperties(jSTypeRegistry47, scope48, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, strMap88);
        java.util.Map<java.lang.String, java.lang.String> strMap90 = null;
        closureCodingConvention16.defineDelegateProxyPrototypeProperties(jSTypeRegistry25, scope26, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, strMap90);
        java.util.Map<java.lang.String, java.lang.String> strMap92 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry14, scope15, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, strMap92);
        boolean boolean95 = closureCodingConvention0.isExported("goog.global");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.abstractMethod" + "'", str19, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(delegateRelationship24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "goog.abstractMethod" + "'", str30, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.global" + "'", str31, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "goog.abstractMethod" + "'", str52, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "goog.global" + "'", str53, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(delegateRelationship58);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objectTypeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship6 = closureCodingConvention0.getDelegateRelationship(node5);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.jscomp.Scope scope8 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention9 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention9.isOptionalParameter(node10);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.jscomp.Scope scope13 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray14 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, objectTypeArray14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention9.defineDelegateProxyPrototypeProperties(jSTypeRegistry12, scope13, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry7, scope8, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap19);
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType23 = null;
        closureCodingConvention0.applySubclassRelationship(functionType21, functionType22, subclassType23);
        java.lang.String str25 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType4 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType1, objectType2, objectType3, functionType4, functionType5);
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention11.isOptionalParameter(node12);
        boolean boolean15 = closureCodingConvention11.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention11.isOptionalParameter(node16);
        boolean boolean19 = closureCodingConvention11.isConstantKey("hi!");
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention11.isVarArgsParameter(node20);
        boolean boolean23 = closureCodingConvention11.isExported("");
        java.lang.String str24 = closureCodingConvention11.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention27 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = closureCodingConvention27.isOptionalParameter(node28);
        java.lang.String str30 = closureCodingConvention27.getAbstractMethodName();
        java.lang.String str31 = closureCodingConvention27.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection32 = closureCodingConvention27.getAssertionFunctions();
        boolean boolean34 = closureCodingConvention27.isConstant("goog.global");
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship36 = closureCodingConvention27.getDelegateRelationship(node35);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType40 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType41 = null;
        closureCodingConvention27.applyDelegateRelationship(objectType37, objectType38, objectType39, functionType40, functionType41);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.jscomp.Scope scope44 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention45 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node46 = null;
        boolean boolean47 = closureCodingConvention45.isOptionalParameter(node46);
        boolean boolean49 = closureCodingConvention45.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.jscomp.Scope scope51 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention52 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = closureCodingConvention52.isOptionalParameter(node53);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.jscomp.Scope scope56 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray57 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList58 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, objectTypeArray57);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = null;
        closureCodingConvention52.defineDelegateProxyPrototypeProperties(jSTypeRegistry55, scope56, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap60);
        java.util.Map<java.lang.String, java.lang.String> strMap62 = null;
        closureCodingConvention45.defineDelegateProxyPrototypeProperties(jSTypeRegistry50, scope51, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap62);
        java.util.Map<java.lang.String, java.lang.String> strMap64 = null;
        closureCodingConvention27.defineDelegateProxyPrototypeProperties(jSTypeRegistry43, scope44, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap64);
        java.util.Map<java.lang.String, java.lang.String> strMap66 = null;
        closureCodingConvention11.defineDelegateProxyPrototypeProperties(jSTypeRegistry25, scope26, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap66);
        java.util.Map<java.lang.String, java.lang.String> strMap68 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap68);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection70 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str71 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str72 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "goog.abstractMethod" + "'", str30, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.global" + "'", str31, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(delegateRelationship36);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objectTypeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "goog.abstractMethod" + "'", str71, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "goog.exportProperty" + "'", str72, "goog.exportProperty");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean7 = closureCodingConvention0.isExported("goog.exportProperty", false);
        boolean boolean9 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isOptionalParameter(node13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        boolean boolean9 = closureCodingConvention0.isExported("goog.exportSymbol");
        boolean boolean11 = closureCodingConvention0.isConstant("goog.exportProperty");
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        java.lang.String str14 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.exportProperty" + "'", str14, "goog.exportProperty");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention5 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention5.isOptionalParameter(node6);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention5.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap15);
        com.google.javascript.rhino.Node node17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node17, strMap18);
        boolean boolean21 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship23 = closureCodingConvention0.getDelegateRelationship(node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast26 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(delegateRelationship23);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship8 = closureCodingConvention0.getClassesDefinedByCall(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.exportSymbol" + "'", str6, "goog.exportSymbol");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean6 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str7 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        java.lang.String str10 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node11 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node11, strMap12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        java.lang.String str10 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        boolean boolean14 = closureCodingConvention0.isPrivate("goog.global");
        java.lang.String str15 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship6 = closureCodingConvention0.getDelegateRelationship(node5);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.jscomp.Scope scope8 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention9 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention9.isOptionalParameter(node10);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.jscomp.Scope scope13 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray14 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, objectTypeArray14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention9.defineDelegateProxyPrototypeProperties(jSTypeRegistry12, scope13, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry7, scope8, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap19);
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType23 = null;
        closureCodingConvention0.applySubclassRelationship(functionType21, functionType22, subclassType23);
        java.lang.String str25 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship27 = closureCodingConvention0.getDelegateRelationship(node26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.exportSymbol" + "'", str25, "goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship27);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        boolean boolean15 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        java.lang.String str16 = closureCodingConvention0.getGlobalObject();
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean19 = closureCodingConvention0.isSuperClassReference("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        boolean boolean14 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean17 = closureCodingConvention0.isExported("");
        boolean boolean19 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        java.lang.String str20 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str21 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean23 = closureCodingConvention0.isExported("hi!");
        boolean boolean25 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportProperty" + "'", str20, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.exportProperty" + "'", str21, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean5 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.exportSymbol");
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind11 = closureCodingConvention0.describeFunctionBind(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean6 = closureCodingConvention0.isExported("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention11.isOptionalParameter(node12);
        java.lang.String str14 = closureCodingConvention11.getAbstractMethodName();
        java.lang.String str15 = closureCodingConvention11.getGlobalObject();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention11.getDelegateRelationship(node16);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.jscomp.Scope scope19 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention20 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = closureCodingConvention20.isOptionalParameter(node21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.jscomp.Scope scope24 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray25 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList26 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, objectTypeArray25);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        closureCodingConvention20.defineDelegateProxyPrototypeProperties(jSTypeRegistry23, scope24, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap28);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        closureCodingConvention11.defineDelegateProxyPrototypeProperties(jSTypeRegistry18, scope19, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList26, strMap32);
        boolean boolean36 = closureCodingConvention0.isExported("hi!", true);
        java.lang.String str37 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node38 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node38, strMap39);
        com.google.javascript.rhino.Node node41 = null;
        boolean boolean42 = closureCodingConvention0.isVarArgsParameter(node41);
        com.google.javascript.rhino.Node node43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind44 = closureCodingConvention0.describeFunctionBind(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "goog.global" + "'", str37, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        java.lang.String str10 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType11, objectType12, objectType13, functionType14, functionType15);
        java.lang.String str17 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.global" + "'", str17, "goog.global");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention5 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention5.isOptionalParameter(node6);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention5.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry3, scope4, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship18 = closureCodingConvention0.getDelegateRelationship(node17);
        boolean boolean20 = closureCodingConvention0.isExported("");
        java.lang.String str21 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(delegateRelationship18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isExported("goog.global");
        boolean boolean4 = closureCodingConvention0.isConstant("goog.exportProperty");
        boolean boolean6 = closureCodingConvention0.isPrivate("goog.global");
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isValidEnumKey("");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.extractClassNameIfRequire(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str8 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean10 = closureCodingConvention0.isConstant("goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean5 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.exportSymbol");
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isOptionalParameter(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = closureCodingConvention0.identifyTypeDeclarationCall(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean6 = closureCodingConvention0.isValidEnumKey("");
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList9 = closureCodingConvention0.identifyTypeDeclarationCall(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        boolean boolean2 = closureCodingConvention0.isOptionalParameter(node1);
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        boolean boolean9 = closureCodingConvention0.isConstant("");
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType11, objectType12, objectType13, functionType14, functionType15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = closureCodingConvention0.getSingletonGetterClassName(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
    }
}

