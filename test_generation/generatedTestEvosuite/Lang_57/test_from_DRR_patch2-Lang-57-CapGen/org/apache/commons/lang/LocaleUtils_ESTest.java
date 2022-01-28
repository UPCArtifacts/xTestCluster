/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 21:49:48 GMT 2021
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("aO_FbhmW}>i%2|;e0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: aO_FbhmW}>i%2|;e0
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage("1.-N{|>\"l/Q00@-;QOK");
      Locale locale0 = Locale.KOREAN;
      Locale locale1 = Locale.SIMPLIFIED_CHINESE;
      Locale locale2 = Locale.GERMANY;
      locale1.getDisplayVariant(locale0);
      locale1.getUnicodeLocaleAttributes();
      LocaleUtils.isAvailableLocale(locale1);
      locale0.getDisplayCountry(locale1);
      LocaleUtils.languagesByCountry("");
      List list1 = LocaleUtils.countriesByLanguage("th");
      assertNotSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry("JP");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocaleUtils.countriesByLanguage("8]$d@u");
      LocaleUtils.languagesByCountry("");
      Locale locale0 = Locale.GERMAN;
      locale0.getDisplayCountry();
      Locale locale1 = Locale.PRC;
      locale1.stripExtensions();
      locale1.hasExtensions();
      locale0.getDisplayName(locale1);
      locale0.getDisplayCountry();
      locale1.toLanguageTag();
      LocaleUtils.localeLookupList(locale0, locale0);
      Locale.forLanguageTag("");
      locale0.getDisplayLanguage();
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils localeUtils0 = new LocaleUtils();
      LocaleUtils.languagesByCountry("8]$d@u");
      LocaleUtils.languagesByCountry("");
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.languagesByCountry("German");
      LocaleUtils.countriesByLanguage("8]$d@u");
      Locale locale2 = Locale.PRC;
      LocaleUtils.isAvailableLocale(locale2);
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("zh-CN");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: zh-CN
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocaleUtils.countriesByLanguage("8]$d@u");
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.GERMAN;
      locale0.getDisplayCountry();
      Locale locale1 = Locale.PRC;
      locale1.stripExtensions();
      locale1.hasExtensions();
      locale0.getDisplayName(locale1);
      locale0.getDisplayCountry();
      locale1.toLanguageTag();
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      Locale.forLanguageTag("");
      locale0.getDisplayLanguage();
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils localeUtils0 = new LocaleUtils();
      LocaleUtils.languagesByCountry("8]$d@u");
      LocaleUtils.countriesByLanguage("UY}>Jmxt:KE-};");
      LocaleUtils.availableLocaleList();
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.toLocale("ca");
      LocaleUtils.availableLocaleList();
      LocaleUtils.countriesByLanguage("zh-CN");
      List list1 = LocaleUtils.countriesByLanguage("");
      assertNotSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry((String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocaleUtils.availableLocaleSet();
      Set set0 = LocaleUtils.availableLocaleSet();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("hu");
      Locale locale1 = new Locale("", "T5B,", "T5B,");
      List list0 = LocaleUtils.localeLookupList(locale1, locale0);
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("h~r?y>a");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: h~r?y>a
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("{TSv9OGBjJ<VX");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: {TSv9OGBjJ<VX
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("Invalid locale format: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: Invalid locale format: 
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
      assertNull(locale0);
  }
}
