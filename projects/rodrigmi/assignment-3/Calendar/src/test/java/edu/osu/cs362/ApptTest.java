package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import java.lang.reflect.*;
import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=23;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(23, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
		 appt.toString();
	 }
	 @Test
	 public void test02()  throws Throwable  {
		 int startHour=24;
		 int startMinute= -1;
		 int startDay=32;
		 int startMonth=0;
		 int startYear=2025;
		 String title="";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		appt.toString();
		assertEquals(false, appt.getValid());
	}
	 @Test
	 public void test03()  throws Throwable  {
		 int startHour=-1;
		 int startMinute= -1;
		 int startDay=32;
		 int startMonth=0;
		 int startYear=2025;
		 String title="";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt.toString();
		 assertEquals(false, appt.getValid());
	}
	 @Test
	 public void test04()  throws Throwable  {
		 int startHour=23;
		 int startMinute= -1;
		 int startDay=32;
		 int startMonth=0;
		 int startYear=2025;
		 String title="";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertEquals(false, appt.getValid());
	 }
	 @Test
	 public void test05()  throws Throwable  {
		 int startHour=23;
		 int startMinute= 61;
		 int startDay=32;
		 int startMonth=0;
		 int startYear=2025;
		 String title="";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 assertEquals(false, appt.getValid());
	}
	@Test
	 public void test06()  throws Throwable  {
		 int startHour=23;
		 int startMinute= 1;
		 int startDay=0;
		 int startMonth=0;
		 int startYear=2025;
		 String title="";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertEquals(false, appt.getValid());
	}
	@Test
	 public void test07()  throws Throwable  {
		 int startHour=23;
		 int startMinute= 59;
		 int startDay=32;
		 int startMonth=0;
		 int startYear=2025;
		 String title="";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertEquals(false, appt.getValid());
	}
	@Test
	public void test08()  throws Throwable  {
		 int startHour=23;
		 int startMinute= 59;
		 int startDay=30;
		 int startMonth=0;
		 int startYear=2025;
		 String title="";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertEquals(false, appt.getValid());
	}
	@Test
	public void test09()  throws Throwable  {
		 int startHour=23;
		 int startMinute= 59;
		 int startDay=30;
		 int startMonth=13;
		 int startYear=2025;
		 String title="";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 assertEquals(false, appt.getValid());
	}
	 @Test
	  public void test10()  throws Throwable  {
		 int startHour=0;
		 int startMinute=0;
		 int startDay=1;
		 int startMonth=1;
		 int startYear=1;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 appt.setStartHour(startHour);
		 //appt.isValid();
		 appt.setStartMinute(startMinute);
		 appt.setStartDay(startDay);
		 appt.setStartMonth(startMonth);

		 Method m = appt.getClass().getDeclaredMethod("isValid", null);
		 m.setAccessible(true);
		 m.invoke(appt, null);

		 appt.setStartYear(startYear);
		 appt.setTitle(title);
		 appt.setDescription(description);
		 appt.toString();
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(0, appt.getStartHour());
		 assertEquals(0, appt.getStartMinute());
		 assertEquals(1, appt.getStartDay());
		 assertEquals(1, appt.getStartMonth());
		 assertEquals(1, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());         		
	}
	@Test
	public void test11()  throws Throwable  {
		 int startHour=0;
		 int startMinute= 59;
		 int startDay=30;
		 int startMonth=13;
		 int startYear=2025;
		 String title="";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 assertEquals(false, appt.getValid());
	}
	@Test
	  public void test12()  throws Throwable  {
		 int startHour=11;
		 int startMinute=59;
		 int startDay=31;
		 int startMonth=12;
		 int startYear=2;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 assertTrue(appt.getValid());
		 String appointment = appt.toString();
		 assertTrue(appointment.contains("11"));
		 assertTrue(appointment.contains("am"));
	}
	@Test
	  public void test13()  throws Throwable  {
		 int startHour=0;
		 int startMinute=61;
		 int startDay=31;
		 int startMonth=12;
		 int startYear=2;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 assertFalse(appt.getValid());
		 assertEquals(null, appt.toString());
	}
	@Test
	  public void test14()  throws Throwable  {
		 int startHour=13;
		 int startMinute=59;
		 int startDay=30;
		 int startMonth=9;
		 int startYear=2;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 assertTrue(appt.getValid());
		 String appointment = appt.toString();
		 assertTrue(appointment.contains("1"));
	}
	@Test
	  public void test15()  throws Throwable  {
		 int startHour=1;
		 int startMinute=1;
		 int startDay=1;
		 int startMonth=1;
		 int startYear=1;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 int newStartHour = -1;
		 appt.setStartHour(newStartHour);
		 assertFalse(appt.getValid());
	}
	@Test
	  public void test16()  throws Throwable  {
		 int startHour=1;
		 int startMinute=1;
		 int startDay=1;
		 int startMonth=1;
		 int startYear=1;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 int newStartMinute = -1;
		 appt.setStartMinute(newStartMinute);
		 assertFalse(appt.getValid());
	}
	@Test
	  public void test17()  throws Throwable  {
		 int startHour=1;
		 int startMinute=1;
		 int startDay=1;
		 int startMonth=1;
		 int startYear=1;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 int newStartDay = -1;
		 appt.setStartDay(newStartDay);
		 assertFalse(appt.getValid());
	}
	@Test
	  public void test18()  throws Throwable  {
		 int startHour=1;
		 int startMinute=1;
		 int startDay=1;
		 int startMonth=1;
		 int startYear=1;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 int newStartMonth = -1;
		 appt.setStartMonth(newStartMonth);		 
		 assertFalse(appt.getValid());
	}
	
}