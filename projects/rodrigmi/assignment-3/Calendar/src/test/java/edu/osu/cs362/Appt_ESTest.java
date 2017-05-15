/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 19:27:25 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Appt_ESTest extends Appt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(0, (-1), (-1), 23, 23, "", "");
      assertEquals(0, appt0.getStartHour());
      
      appt0.setStartHour(23);
      assertEquals(23, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 12, "", "");
      boolean boolean0 = appt0.getValid();
      assertTrue(boolean0);
      assertEquals(12, appt0.getStartDay());
      assertEquals(12, appt0.getStartMinute());
      assertEquals(12, appt0.getStartYear());
      assertEquals(12, appt0.getStartHour());
      assertEquals(12, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(11, 0, 0, 0, (-1100), (String) null, (String) null);
      String string0 = appt0.getTitle();
      assertEquals(-1100, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertNotNull(string0);
      assertEquals(11, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(0, 670, 3326, 670, 0, "", (String) null);
      int int0 = appt0.getStartYear();
      assertEquals(670, appt0.getStartMonth());
      assertEquals(670, appt0.getStartMinute());
      assertEquals(0, int0);
      assertEquals(3326, appt0.getStartDay());
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 31, (-1), (-1), (String) null, (String) null);
      appt0.setStartYear(670);
      int int0 = appt0.getStartYear();
      assertEquals(670, int0);
  }


  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "", "");
      int int0 = appt0.getStartMonth();
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt(1819, 1819, 59, (-1431), 59, "e&U0P@EHuROZP3", "w_}XkKYYm&");
      appt0.setStartMonth(1);
      int int0 = appt0.getStartMonth();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(1989, 1989, 0, 0, (-693), "", "");
      int int0 = appt0.getStartMinute();
      assertEquals(1989, int0);
      assertEquals(1989, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals(-693, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, (-86), "", "");
      int int0 = appt0.getStartHour();
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(-86, appt0.getStartYear());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(2364, (-703), 2364, 2364, (-5308), "VKc3W3uI-d!>!s=&}d", "VKc3W3uI-d!>!s=&}d");
      int int0 = appt0.getStartHour();
      assertEquals("VKc3W3uI-d!>!s=&}d", appt0.getTitle());
      assertEquals(2364, int0);
      assertEquals(2364, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(-703, appt0.getStartMinute());
      assertEquals(-5308, appt0.getStartYear());
      assertEquals(2364, appt0.getStartDay());
      assertEquals("VKc3W3uI-d!>!s=&}d", appt0.getDescription());
  }


  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(2965, 2965, 0, 1, 1, "N-T7DKAl92&e~Z*KI", "N-T7DKAl92&e~Z*KI");
      int int0 = appt0.getStartDay();
      assertEquals(2965, appt0.getStartMinute());
      assertEquals(0, int0);
      assertEquals("N-T7DKAl92&e~Z*KI", appt0.getDescription());
      assertEquals("N-T7DKAl92&e~Z*KI", appt0.getTitle());
      assertEquals(1, appt0.getStartYear());
      assertEquals(1, appt0.getStartMonth());
      assertEquals(2965, appt0.getStartHour());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(2364, (-703), 2364, 2364, (-5308), "VKc3W3uI-d!>!s=&}d", "VKc3W3uI-d!>!s=&}d");
      int int0 = appt0.getStartDay();
      assertEquals(2364, appt0.getStartMonth());
      assertEquals("VKc3W3uI-d!>!s=&}d", appt0.getTitle());
      assertEquals(2364, appt0.getStartHour());
      assertEquals(-5308, appt0.getStartYear());
      assertEquals(2364, int0);
      assertEquals("VKc3W3uI-d!>!s=&}d", appt0.getDescription());
      assertEquals(-703, appt0.getStartMinute());
      assertFalse(appt0.getValid());
  }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 31, (-1), (-1), (String) null, (String) null);
      String string0 = appt0.getDescription();
      assertEquals(-1, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(31, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-1, appt0.getStartMonth());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, (-86), "", "");
      appt0.setDescription("");
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals(-86, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(0, 1, (-2371), 1, (-2371), "D\"28n.||vvsOno", (String) null);
      assertEquals("", appt0.getDescription());
      
      appt0.setDescription((String) null);
      assertEquals(-2371, appt0.getStartYear());
      assertEquals(1, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartHour());
      assertEquals(-2371, appt0.getStartDay());
      assertEquals(1, appt0.getStartMonth());
      assertEquals("D\"28n.||vvsOno", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, (-86), "", "");
      appt0.setTitle("");
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-86, appt0.getStartYear());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "a8}M", "a8}M");
      String string0 = appt0.getTitle();
      assertEquals("a8}M", string0);
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertEquals("a8}M", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartHour());
  }
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt(0, 5703, (-1047), 0, (-1), "\"C8 j\"63\"`Lb04w|05", "\"C8 j\"63\"`Lb04w|05");
      int int0 = appt0.getStartDay();
      assertEquals(5703, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals((-1047), int0);
      assertEquals(-1, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
      assertEquals("\"C8 j\"63\"`Lb04w|05", appt0.getDescription());
      assertEquals("\"C8 j\"63\"`Lb04w|05", appt0.getTitle());
  }
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "", "");
      boolean boolean0 = appt0.getValid();
      assertEquals(0, appt0.getStartDay());
      assertFalse(boolean0);
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt((-1947), (-1947), 0, 0, 0, "", "");
      int int0 = appt0.getStartHour();
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
      assertEquals(-1947, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartYear());
      assertEquals((-1947), int0);
  }


  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 31, (-1), (-1), (String) null, (String) null);
      int int0 = appt0.getStartYear();
      assertEquals((-1), int0);
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(31, appt0.getStartDay());
      assertEquals(0, appt0.getStartHour());
      assertEquals(-1, appt0.getStartMonth());
  }


  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt(0, (-275), 3826, 3826, (-275), "", "");
      int int0 = appt0.getStartMinute();
      assertEquals(0, appt0.getStartHour());
      assertEquals((-275), int0);
      assertFalse(appt0.getValid());
      assertEquals(-275, appt0.getStartYear());
      assertEquals(3826, appt0.getStartDay());
      assertEquals(3826, appt0.getStartMonth());
  }


  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt(11, 1, 1, (-3717), 23, "*/aolQpR,1hfuG%yc", "aN");
      String string0 = appt0.getDescription();
      assertEquals(1, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(1, appt0.getStartDay());
      assertEquals(23, appt0.getStartYear());
      assertEquals(11, appt0.getStartHour());
      assertEquals(-3717, appt0.getStartMonth());
      assertEquals("*/aolQpR,1hfuG%yc", appt0.getTitle());
      assertEquals("aN", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(1819, 1819, 59, (-1431), 59, "e&U0P@EHuROZP3", "w_}XkKYYm&");
      int int0 = appt0.getStartMonth();
      assertEquals((-1431), int0);
      assertFalse(appt0.getValid());
      assertEquals("w_}XkKYYm&", appt0.getDescription());
      assertEquals(1819, appt0.getStartHour());
      assertEquals(59, appt0.getStartYear());
      assertEquals(59, appt0.getStartDay());
      assertEquals(1819, appt0.getStartMinute());
      assertEquals("e&U0P@EHuROZP3", appt0.getTitle());
  }


  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 6, 6, "?{", "?{");
      appt0.setStartHour(0);
      appt0.toString();
      assertEquals(0, appt0.getStartHour());
  }


  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(18, 18, 18, 11, (-745), "$)k>jGL,EULZg$H@", "$)k>jGL,EULZg$H@");
      String string0 = appt0.toString();
      assertEquals("\t11/18/-745 at 6:18pm ,$)k>jGL,EULZg$H@, $)k>jGL,EULZg$H@\n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(11, 1, 1, (-3717), 23, "*/aolQpR,1hfuG%yc", "aN");
      String string0 = appt0.toString();
      assertEquals(23, appt0.getStartYear());
      assertNull(string0);
      assertEquals("*/aolQpR,1hfuG%yc", appt0.getTitle());
      assertEquals(-3717, appt0.getStartMonth());
      assertEquals("aN", appt0.getDescription());
      assertEquals(1, appt0.getStartMinute());
      assertEquals(11, appt0.getStartHour());
      assertEquals(1, appt0.getStartDay());
  }


  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(11, 1, 1, (-3717), 23, "*/aolQpR,1hfuG%yc", "aN");
      assertEquals("*/aolQpR,1hfuG%yc", appt0.getTitle());
      
      appt0.setTitle((String) null);
      assertEquals(23, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 1, 205, 0, "", "");
      assertEquals(205, appt0.getStartMonth());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(1, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(59, 59, 59, 0, (-1), "", "");
      appt0.setStartHour(11);
      assertEquals(11, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 92, "`ANZ9c", (String) null);
      int int0 = appt0.getStartMinute();
      assertEquals(0, int0);
      assertEquals("`ANZ9c", appt0.getTitle());
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
      assertEquals("", appt0.getDescription());
      assertEquals(92, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(11, 1, 1, (-3717), 23, "*/aolQpR,1hfuG%yc", "aN");
      appt0.setStartMinute((-3122));
      assertEquals(-3122, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt(11, 1, 1, (-3717), 23, "*/aolQpR,1hfuG%yc", "aN");
      assertEquals(1, appt0.getStartDay());
      
      appt0.setStartDay(11);
      assertEquals(11, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Appt appt0 = new Appt(11, 1, 1, (-3717), 23, "*/aolQpR,1hfuG%yc", "aN");
      assertEquals(-3717, appt0.getStartMonth());
      
      appt0.setStartMonth(1);
      String string0 = appt0.toString();
      assertEquals("\t1/1/23 at 11:1am ,*/aolQpR,1hfuG%yc, aN\n", string0);
  }
}