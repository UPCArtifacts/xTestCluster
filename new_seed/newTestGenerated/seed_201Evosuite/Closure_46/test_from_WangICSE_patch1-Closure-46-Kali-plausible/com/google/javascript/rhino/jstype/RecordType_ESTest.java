/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 24 16:39:04 GMT 2022
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.UnknownType;
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("RecordProperty associated with a property should not be null!", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType1);
      assertTrue(jSType0.equals((Object)recordType0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      RecordType recordType1 = recordType0.toMaybeRecordType();
      assertFalse(recordType1.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      recordType0.setOwnerFunction(noType0);
      RecordType recordType1 = recordType0.toMaybeRecordType();
      assertFalse(recordType1.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordType.isSubtype((ObjectType) recordType0, recordType0);
      recordType0.toMaybeRecordType();
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.setOwnerFunction(noResolvedType0);
      JSType jSType0 = recordType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertFalse(jSType0.isEnumType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Unknown class name", "Unknown class name", 0, 1);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getLeastSupertype(namedType0);
      assertFalse(jSType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ObjectType objectType0 = recordType0.getImplicitPrototype();
      recordType0.getLeastSupertype(objectType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = noResolvedType0.getPropertyType("");
      JSType jSType1 = recordType0.getLeastSupertype(jSType0);
      assertFalse(jSType1.isEnumType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = recordType0.getLeastSupertype(allType0);
      assertNotSame(allType0, jSType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ObjectType objectType0 = recordType0.getImplicitPrototype();
      recordType0.resolveInternal(simpleErrorReporter0, objectType0);
      ObjectType objectType1 = recordType0.getImplicitPrototype();
      assertTrue(objectType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      recordType0.resolveInternal(simpleErrorReporter0, errorFunctionType0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType0);
      assertFalse(jSType0.isUnionType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty((JSType) null, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("lwS~Lft.RUVJ'dk9", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      // Undeclared exception!
      try { 
        recordType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.RecordType", e);
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
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
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
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
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType0);
      // Undeclared exception!
      try { 
        jSType0.isEquivalentTo(recordType0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      // Undeclared exception!
      try { 
        recordType0.getLeastSupertype((JSType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSType", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType0);
      // Undeclared exception!
      try { 
        jSType0.getLeastSupertype(jSType0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      ArrowType arrowType0 = new ArrowType(jSTypeRegistry0, (Node) null, allType0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, arrowType0, "tv;F=[UA?yuivyq'aD1");
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      // Undeclared exception!
      try { 
        recordType0.getGreatestSubtypeHelper(enumElementType0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.ArrowType", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
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
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)recordType0.getGreatestSubtypeHelper(recordType0);
      JSType[] jSTypeArray0 = new JSType[2];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      // Undeclared exception!
      try { 
        instanceObjectType0.defineProperty("Named type with empty name component", recordType0, true, node0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
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
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(objectType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = RecordType.isSubtype(objectType0, recordType0);
      assertTrue(objectType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType0);
      boolean boolean0 = recordType0.isSubtype(jSType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.isSubtype(recordType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, (Node) null);
      hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordType recordType2 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType1.isEquivalentTo(recordType2);
      assertFalse(recordType2.equals((Object)recordType0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap1 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap1);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.isEquivalentTo(recordType1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.isEquivalentTo(recordType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) noResolvedType0, "Named type with empty name component", "|<?y&zm-$T eC<]}HW", 0, 1);
      boolean boolean0 = recordType0.isEquivalentTo(jSType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Unknown class name", "Unknown class name", 0, 1);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(namedType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("`wfBYPh]NXPG+hdI/", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordType recordType1 = (RecordType)recordType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertFalse(recordType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("rxVZkAfn", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertTrue(noResolvedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      RecordType recordType1 = (RecordType)recordType0.getLeastSupertype(jSType0);
      assertFalse(recordType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      Node node0 = Node.newNumber(1743.67031, (-1), 0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(unknownType0, node0);
      hashMap0.put("", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      boolean boolean0 = RecordType.isSubtype((ObjectType) noType0, recordType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = RecordType.isSubtype((ObjectType) noResolvedType0, recordType0);
      assertTrue(boolean0);
      assertFalse(noResolvedType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(recordType0);
      NoObjectType noObjectType0 = (NoObjectType)recordType0.getGreatestSubtypeHelper(jSType0);
      boolean boolean0 = RecordType.isSubtype((ObjectType) noObjectType0, recordType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(noResolvedType0);
      assertTrue(jSType0.matchesObjectContext());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, (Node) null);
      hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType1 = recordType0.getGreatestSubtypeHelper(recordType1);
      assertTrue(recordType1.hasCachedValues());
      assertTrue(jSType1.equals((Object)recordType1));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, (Node) null);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType1 = recordType1.getGreatestSubtypeHelper(recordType0);
      assertTrue(recordType0.hasCachedValues());
      assertTrue(jSType1.equals((Object)recordType1));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.defineProperty("Unknown class name", recordType0, true, (Node) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap1 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap1);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.isSubtype(recordType1);
      assertTrue(recordType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, (Node) null);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty1 = new RecordTypeBuilder.RecordProperty(recordType0, (Node) null);
      hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty1);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      assertFalse(recordType1.equals((Object)recordType0));
  }
}
