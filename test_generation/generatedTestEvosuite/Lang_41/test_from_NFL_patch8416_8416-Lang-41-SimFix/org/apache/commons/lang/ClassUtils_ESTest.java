/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 21:44:45 GMT 2021
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Class<Byte>[] classArray0 = (Class<Byte>[]) Array.newInstance(Class.class, 9);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 4);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, (Class<?>[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("Lsun.misc.Launcher$AppClassLoader");
      assertEquals("Launcher.AppClassLoader", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 4);
      Class<Double> class0 = Double.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = classArray0[1];
      classArray0[3] = classArray0[0];
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("K9<IU~8$K\"T");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Class<Short> class0 = Short.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("long", false);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("[[F", true);
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("[Z");
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "int");
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "org.apache.commons.lang.builder.ToStringStyle$1");
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "[Z");
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Class<Object> class0 = Object.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getShortCanonicalName("[O:_]'}x");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        ClassUtils.getPublicMethod(class0, (String) null, (Class<?>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<Boolean> class0 = Boolean.class;
      try { 
        ClassUtils.getPublicMethod(class0, ";k&", classArray0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ClassUtils.getClass(classLoader0, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ClassUtils.getClass(classLoader0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      try { 
        ClassUtils.getClass(" <", false);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "int", true);
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "kN/zQ47", false);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Class<?> class0 = ClassUtils.primitiveToWrapper((Class<?>) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
      assertEquals(17, class1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, (Class<?>) null, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("java.lang");
      assertEquals("java", string0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("u!=VI8pzO08]N}LhV");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Class<Float> class0 = Float.class;
      String string0 = ClassUtils.getPackageName(class0);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("7i8MqD$ ");
      assertEquals("7i8MqD. ", string0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("4.1");
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      String string0 = ClassUtils.getShortClassName(class0);
      assertEquals("Byte", string0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[");
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[L");
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getPackageCanonicalName("[O:_]'}x");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      String string0 = ClassUtils.getPackageCanonicalName((Object) class0, "org.apache.commons.lang.SystemUtils");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("Integer", string0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) "", "");
      assertEquals("String", string0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
      Class<Double> class0 = Double.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
      assertEquals(1, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 4);
      // Undeclared exception!
      try { 
        ClassUtils.toClass(classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      try { 
        ClassUtils.getClass("[]");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("byte");
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(1, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Float> class1 = Float.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Boolean> class1 = Boolean.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Float> class1 = Float.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Float> class1 = Float.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Object> class1 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Object> class1 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<String> class1 = String.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Class<Float> class0 = Float.class;
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
      Class<Double> class0 = Double.class;
      classArray0[0] = class0;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Class<Byte>[] classArray0 = (Class<Byte>[]) Array.newInstance(Class.class, 1);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, (Class<?>[]) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add(".");
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertEquals(1, list1.size());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
      assertTrue(list2.equals((Object)list0));
      assertNotNull(list2);
      assertFalse(list2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllInterfaces((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(classArray0[0]);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Class<Short> class0 = Short.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "[][]");
      assertEquals("[][]", string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "[][]");
      assertEquals("[][]", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) "bj", "bj");
      assertEquals("String", string0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      String string0 = ClassUtils.getPackageName((Object) classUtils0, ".");
      assertEquals("org.apache.commons.lang", string0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("O$LhY$.18@HgNE-Ty%");
      assertEquals("O$LhY$", string0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "P^1%LC4Ks=o7>-f");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }
}
