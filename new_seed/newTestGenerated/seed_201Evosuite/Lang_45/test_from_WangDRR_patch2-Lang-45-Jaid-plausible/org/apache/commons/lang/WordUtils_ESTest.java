/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 25 04:32:31 GMT 2022
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WordUtils_ESTest extends WordUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", (-908), 0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.abbreviate("org.apache.commons.lang.WordUtils", 0, 0, "Nr}bF");
      assertEquals("Nr}bF", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.abbreviate("]", 2699, 1, "");
      assertEquals("]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 0, 147, "\"{ZOkIkhXmPi7Bu)?");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.abbreviate("H?p/ |\"~", 1, (-96), "");
      assertEquals("H", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.wrap("", 0, "", true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, (-4218));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WordUtils.wrap("", (-908));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = WordUtils.initials((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WordUtils.capitalize("g[y");
      assertEquals("G[y", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = WordUtils.wrap("org.apache.commons.lang.WordUtils", 0, "org.apache.commons.lang.WordUtils", true);
      char[] charArray0 = new char[9];
      // Undeclared exception!
      WordUtils.uncapitalize(string0, charArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'H';
      String string0 = WordUtils.initials("6yRHT", charArray0);
      assertEquals("6", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WordUtils.initials("]c+mxau6;k!t';j", (char[]) null);
      assertEquals("]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = WordUtils.initials("", (char[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize((String) null, charArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[6];
      String string0 = WordUtils.uncapitalize("", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("]gLqIMA/j=\"$ s!", (char[]) null);
      assertEquals("]gLqIMA/j=\"$ s!", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("", (char[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[4] = 'm';
      String string0 = WordUtils.capitalize("^omgqdmfa", charArray0);
      assertEquals("^omGqdmFa", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null, (char[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.wrap("bIBWSzgb", 2, "B", false);
      assertEquals("bIBWSzgb", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.wrap("?5od`*6J<xPO| _aa4", 11, "[f", false);
      assertEquals("?5od`*6J<xPO|[f_aa4", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = WordUtils.wrap("Windows 9", 0, "'Cf4:NRbQla", true);
      assertEquals("W'Cf4:NRbQlai'Cf4:NRbQlan'Cf4:NRbQlad'Cf4:NRbQlao'Cf4:NRbQlaw'Cf4:NRbQlas'Cf4:NRbQla9", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = WordUtils.wrap(" \t\r\n\b", (-1), (String) null, true);
      assertEquals("\t\n\r\n\n\n\b", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        WordUtils.abbreviate("H?p/ |\"~", (-2137), (-487), "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = WordUtils.abbreviate("C!wX@", (-1), (-1), "C!wX@");
      assertEquals("C!wX@", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", (-908), (-908), "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = WordUtils.abbreviate("H?p/ |\"~", (-23), 3389, "kt#{?3[XNx-Fx0X_");
      assertEquals("H?p/kt#{?3[XNx-Fx0X_", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, (-4140), (-4140), (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = WordUtils.initials("SEy17AO\"kZhuW*hO L");
      assertEquals("SL", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("MGDb,PE|J;;", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.initials("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = WordUtils.initials((String) null, (char[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = WordUtils.uncapitalize(".Y'M@@&U[H-.V K");
      assertEquals(".Y'M@@&U[H-.V k", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("@+@ :Vd!aU\"hkFp", charArray0);
      assertEquals("@+@ :Vd!aU\"hkFp", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("org.apache.commons.lang.WordUtils", charArray0);
      assertEquals("org.apache.commons.lang.WordUtils", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.capitalizeFully((String) null, charArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = WordUtils.swapCase("org.apache.commons.lang.WordUtils");
      assertEquals("ORG.APACHE.COMMONS.LANG.wORDuTILS", string0);
      
      char[] charArray0 = new char[9];
      charArray0[1] = 't';
      String string1 = WordUtils.capitalizeFully(string0, charArray0);
      assertEquals("Org.apache.commons.lang.wordutIls", string1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("wBp3l", charArray0);
      assertEquals("wBp3l", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = WordUtils.capitalize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = WordUtils.wrap(" haUq|n?4E~\"rIkq", 1);
      assertEquals("haUq|n?4E~\"rIkq", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = WordUtils.wrap("org.apache.commons.lang.WordUtils", (-1821), "org.apache.commons.lang.WordUtils", true);
      char[] charArray0 = new char[9];
      // Undeclared exception!
      WordUtils.capitalizeFully(string0, charArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 32, "H?p/ |\"~", false);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("\"{ZOkIkhXmPi7Bu)?");
      assertEquals("\"{zokikhxmpi7bu)?", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null);
      assertNull(string0);
  }
}
