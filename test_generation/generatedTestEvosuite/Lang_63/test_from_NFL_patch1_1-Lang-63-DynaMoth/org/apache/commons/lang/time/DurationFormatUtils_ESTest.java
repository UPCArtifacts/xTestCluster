/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 21:57:44 GMT 2021
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(stringBuffer0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(stringBuffer0);
      durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("M");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("M", (-90));
      durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("M");
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[3];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      // Undeclared exception!
      try { 
        DurationFormatUtils.format(durationFormatUtils_TokenArray0, 0, 0, 1000, 0, (-441), 1, 277, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFormatUtils.formatPeriodISO((-1414L), (-203L));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DurationFormatUtils.formatDurationISO(2419200006L);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DurationFormatUtils.formatDurationWords((-109L), true, false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DurationFormatUtils.formatPeriod(86399999L, 1450L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DurationFormatUtils.formatDurationHMS(2419200015L);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDurationWords(2419200000L, false, false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      durationFormatUtils_Token0.getValue();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token((Object) null);
      durationFormatUtils_Token0.getCount();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      StringWriter stringWriter0 = new StringWriter(28);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      DurationFormatUtils.reduceAndCorrect(calendar0, calendar0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.lexx("-KSTcfC&V");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFormatUtils.lexx("");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      DurationFormatUtils.formatPeriod((-1L), (-174L), "", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFormatUtils.formatPeriod((-632L), 2454L, "");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFormatUtils.formatDuration(97L, "", false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFormatUtils.formatDuration((-2190L), "");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[6];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@000000001828java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@0000000022006java.lang.StringBuffer@0000000023", 72);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.StringBuffer@0000000025");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(stringBuffer0, 1808);
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token1;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token1;
      durationFormatUtils_TokenArray0[3] = durationFormatUtils_Token1;
      durationFormatUtils_TokenArray0[4] = durationFormatUtils_TokenArray0[2];
      durationFormatUtils_TokenArray0[5] = durationFormatUtils_TokenArray0[1];
      DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-3579), 1, 1808, (-2108), 32, (-3579), 71, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M'(.S'S'");
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[2];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
      DurationFormatUtils.format(durationFormatUtils_TokenArray0, 13, 97, 13, (-3706), 97, 3688, (-3706), true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect((Calendar) null, (Calendar) null, 1184, 1184);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 256, 256);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1285, 1940, 0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 1285, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1285
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0, 2498);
      String string0 = durationFormatUtils_Token0.toString();
      // Undeclared exception!
      DurationFormatUtils.lexx(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.lexx((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("", 656);
      String string0 = durationFormatUtils_Token0.toString();
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(2665L, (-385L), string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod(1588L, 1588L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration((-89L), (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration((-1075L), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-1607));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod((-387L), 2419200000L, (String) null, false, timeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@0000000022000java.lang.StringBuffer@0000000023");
      String string0 = DurationFormatUtils.formatPeriod((-174L), (-1L), "java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@0000000022000java.lang.StringBuffer@0000000023", true, timeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(2587L, " 0 minutes", true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1L, "H", true);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(497L, " 1 seconds", true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@0000000009-1java.lang.StringBuffer@000000001042");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@0000000009-1java.lang.StringBuffer@000000001042");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@0000000009-1java.lang.StringBuffer@000000001042");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@0000000009-1java.lang.StringBuffer@000000001042");
      durationFormatUtils_Token1.increment();
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@0000000009-1java.lang.StringBuffer@000000001042");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("d gMRV");
      boolean boolean0 = durationFormatUtils_Token0.equals("d gMRV");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1558L, "0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000111java.lang.StringBuffer@0000000012", false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-31L), 2419200015L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-31L), 2419200015L, "672java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@0000000010015");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(0L, 2419200000L, "28java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-2332L), true, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-708L), "j[f'ra:9aKDx%Zpqs");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("s", (-2537));
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }
}
