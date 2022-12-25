/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 25 05:51:44 GMT 2022
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RecordType_ESTest extends RecordType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Node node0 = Node.newString("com.google.javascript.rhino.jstype.FunctionBuilder", 1, 0);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, numberType0, "");
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.FunctionBuilder", enumElementType0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(prototypeObjectType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("RecordProperty associated with a property should not be null!", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordType recordType1 = jSTypeRegistry0.createRecordType(hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType1);
      assertTrue(jSType0.equals((Object)recordType0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      recordType0.resolveInternal((ErrorReporter) null, recordType0);
      RecordType recordType1 = recordType0.toMaybeRecordType();
      assertEquals(BooleanLiteralSet.TRUE, recordType1.getPossibleToBooleanOutcomes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      Node node0 = Node.newString("Not declared as a type name");
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      NoObjectType noObjectType0 = (NoObjectType)recordType0.getGreatestSubtypeHelper(errorFunctionType0);
      noObjectType0.setPrototype(recordType0, node0);
      RecordType recordType1 = recordType0.toMaybeRecordType();
      assertEquals(BooleanLiteralSet.TRUE, recordType1.getPossibleToBooleanOutcomes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      Node node0 = Node.newString("Not declared as a type name");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("(*Rt}cQg=x]RBFnL7<", recordTypeBuilder_RecordProperty0);
      errorFunctionType0.defineDeclaredProperty("(*Rt}cQg=x]RBFnL7<", errorFunctionType0, node0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordType recordType1 = recordType0.toMaybeRecordType();
      assertTrue(recordType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "NEG");
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.setOwnerFunction(errorFunctionType0);
      JSType jSType0 = recordType0.resolveInternal(simpleErrorReporter0, errorFunctionType0);
      assertFalse(jSType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, (Node) null);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType1.resolveInternal(simpleErrorReporter0, recordType0);
      boolean boolean0 = recordType0.isSubtype(jSType0);
      assertTrue(recordType0.isResolved());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      recordType0.resolveInternal((ErrorReporter) null, recordType0);
      ObjectType objectType0 = recordType0.getImplicitPrototype();
      assertTrue(objectType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      ObjectType objectType0 = recordType0.getImplicitPrototype();
      assertTrue(objectType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)recordType0.getGreatestSubtypeHelper(recordType0);
      recordType0.resolveInternal(simpleErrorReporter0, instanceObjectType0);
      InstanceObjectType instanceObjectType1 = (InstanceObjectType)recordType0.getGreatestSubtypeHelper(recordType0);
      assertFalse(instanceObjectType1.isEnumType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, " ");
      Node node0 = Node.newString(0, "Named type with empty name component");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
      errorFunctionType0.setOwnerFunction(errorFunctionType0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("", recordTypeBuilder_RecordProperty0);
      errorFunctionType0.defineDeclaredProperty("", errorFunctionType0, node0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.getGreatestSubtypeHelper(errorFunctionType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      Node node0 = Node.newString("&s05K#ZxW");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty((JSType) null, node0);
      hashMap0.put("&s05K#ZxW", recordTypeBuilder_RecordProperty0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      // Undeclared exception!
      try { 
        recordType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.RecordType", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "vXaTh<VtN$Jqb-B@");
      Node node0 = Node.newString("Not declared as a type name", 1, 0);
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "vXaTh<VtN$Jqb-B@");
      errorFunctionType0.setPrototypeBasedOn(unresolvedTypeExpression0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      // Undeclared exception!
      try { 
        recordType0.resolveInternal(simpleErrorReporter0, errorFunctionType0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.jstype.UnionType cannot be cast to com.google.javascript.rhino.jstype.ObjectType
         //
         verifyException("com.google.javascript.rhino.jstype.PrototypeObjectType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        RecordType.isSubtype((ObjectType) null, (RecordType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.RecordType", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      // Undeclared exception!
      try { 
        recordType0.isSubtype((JSType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSType", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "7h");
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType0);
      // Undeclared exception!
      try { 
        jSType0.isSubtype(errorFunctionType0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      // Undeclared exception!
      try { 
        recordType0.isEquivalentTo((JSType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.RecordType", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)recordType0.getGreatestSubtypeHelper(recordType0);
      // Undeclared exception!
      try { 
        instanceObjectType0.getImplicitPrototype();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      // Undeclared exception!
      try { 
        recordType0.getGreatestSubtypeHelper((JSType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.RecordType", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newString("Not declared as a type name");
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)recordType0.getGreatestSubtypeHelper(recordType0);
      // Undeclared exception!
      try { 
        instanceObjectType0.defineProperty("Unknown class name", recordType0, false, node0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      RecordType recordType0 = null;
      try {
        recordType0 = new RecordType(jSTypeRegistry0, (Map<String, RecordTypeBuilder.RecordProperty>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.RecordType", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = RecordType.isSubtype((ObjectType) errorFunctionType0, recordType0);
      assertTrue(errorFunctionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.isSubtype(recordType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Node node0 = Node.newString("com.google.javascript.rhino.jstype.FunctionBuilder", 1, 0);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, numberType0, "");
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.FunctionBuilder", enumElementType0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(prototypeObjectType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("RecordProperty associated with a property should not be null!", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType1.isEquivalentTo(recordType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, recordType0, (JSType) null);
      boolean boolean0 = recordType0.isEquivalentTo(indexedType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "u");
      Node node0 = errorFunctionType0.getParametersNode();
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("u", recordTypeBuilder_RecordProperty0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      errorFunctionType0.defineDeclaredProperty("u", allType0, node0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = RecordType.isSubtype((ObjectType) errorFunctionType0, recordType0);
      assertFalse(boolean0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "vXaTh<9tNHJqb-`@");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      NoObjectType noObjectType0 = (NoObjectType)recordType0.getGreatestSubtypeHelper(errorFunctionType0);
      boolean boolean0 = RecordType.isSubtype((ObjectType) noObjectType0, recordType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "()");
      Node node0 = errorFunctionType0.getParametersNode();
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(unresolvedTypeExpression0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      boolean boolean0 = RecordType.isSubtype((ObjectType) noType0, recordType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Node node0 = Node.newString("com.google.javascript.rhino.jstype.FunctionBuilder", 1, 0);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.FunctionBuilder");
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, templateType0, "Not declared as a type name");
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "^qVnsl", templateType0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(enumElementType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("/@W171Pa(Zexp>60", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = RecordType.isSubtype((ObjectType) prototypeObjectType0, recordType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, " ");
      Node node0 = Node.newString(0, "Named type with empty name component");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("", recordTypeBuilder_RecordProperty0);
      errorFunctionType0.defineDeclaredProperty("", errorFunctionType0, node0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = RecordType.isSubtype((ObjectType) errorFunctionType0, recordType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "u");
      Node node0 = errorFunctionType0.getParametersNode();
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("u", recordTypeBuilder_RecordProperty0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      errorFunctionType0.defineDeclaredProperty("u", allType0, node0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.getGreatestSubtypeHelper(errorFunctionType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, ".[");
      Node node0 = Node.newString(1, "Not declared as a constructor", 1, 0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("com.google.javascript.rhino.jstype.SimpleSlot", recordTypeBuilder_RecordProperty0);
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "Not declared as a type name");
      errorFunctionType0.defineDeclaredProperty("com.google.javascript.rhino.jstype.SimpleSlot", unresolvedTypeExpression0, (Node) null);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.getGreatestSubtypeHelper(errorFunctionType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, " ");
      Node node0 = Node.newString(0, "Named type with empty name component");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("", recordTypeBuilder_RecordProperty0);
      ErrorFunctionType errorFunctionType1 = new ErrorFunctionType(jSTypeRegistry0, "");
      errorFunctionType1.defineDeclaredProperty("", errorFunctionType0, node0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.getGreatestSubtypeHelper(errorFunctionType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty((JSType) null, (Node) null);
      hashMap0.put("", recordTypeBuilder_RecordProperty0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      errorFunctionType0.defineDeclaredProperty("", (JSType) null, (Node) null);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.getGreatestSubtypeHelper(errorFunctionType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType.getGreatestSubtype((JSType) recordType0, (JSType) numberType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Node node0 = Node.newString("com.google.javascript.rhino.jstype.FunctionBuilder", 1, 0);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, numberType0, "");
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.FunctionBuilder", enumElementType0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(prototypeObjectType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("RecordProperty associated with a property should not be null!", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap1 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType1 = jSTypeRegistry0.createRecordType(hashMap1);
      recordType1.getGreatestSubtypeHelper(recordType0);
      assertTrue(recordType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      Node node0 = Node.newString("Not declared as a type name");
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.defineProperty("Unknown class name", errorFunctionType0, true, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", (-4819), 2);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(namedType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      assertTrue(recordType1.equals((Object)recordType0));
      
      JSType jSType0 = recordType1.resolveInternal(simpleErrorReporter0, errorFunctionType0);
      boolean boolean0 = recordType0.isEquivalentTo(jSType0);
      assertFalse(recordType1.equals((Object)recordType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Node node0 = Node.newString("com.google.javascript.rhino.jstype.FunctionBuilder", 1, 0);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, numberType0, "");
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.FunctionBuilder", enumElementType0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(prototypeObjectType0, node0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("RecordProperty associated with a property should not be null!", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap1 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType1 = jSTypeRegistry0.createRecordType(hashMap1);
      JSType.getGreatestSubtype((JSType) recordType1, (JSType) recordType0);
      assertTrue(recordType1.hasCachedValues());
      assertFalse(recordType0.equals((Object)recordType1));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, (Node) null);
      hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType1.getGreatestSubtypeHelper(recordType0);
      assertTrue(recordType0.hasCachedValues());
      assertTrue(recordType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("", (RecordTypeBuilder.RecordProperty) null);
      RecordType recordType0 = null;
      try {
        recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // RecordProperty associated with a property should not be null!
         //
         verifyException("com.google.javascript.rhino.jstype.RecordType", e);
      }
  }
}
