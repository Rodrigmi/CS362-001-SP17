package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.lang.reflect.*;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar day1 = new GregorianCalendar(2017,4,28);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,29);
		 LinkedList<Appt> appts = new LinkedList<Appt>();

		 timetable.getApptRange(appts,day1,day2);

		assertNotNull(timetable.getApptRange(appts, day1, day2));
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar day1 = new GregorianCalendar();
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,29);
		 LinkedList<Appt> appts = new LinkedList<Appt>();

		 timetable.getApptRange(appts,day1,day2);

		 assertNotNull(timetable.getApptRange(appts, day1, day2));
	 }
	 @Test
	  public void test03()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,28);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,29);

		 CalDay calday = new CalDay(cal);

	  	 Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	 Appt apptt = new Appt(2,2,2,2,2,"a","b");
	  	 Appt appttt = new Appt(3,3,3,3,3,"a","b"); 

	  	 calday.addAppt(appt);
	  	 calday.addAppt(apptt);
	  	 calday.addAppt(appttt);

		 timetable.getApptRange(calday.getAppts(),day1,day2);

		 assertNotNull(timetable.getApptRange(calday.getAppts(), day1, day2));
	 }
	 @Test
	  public void test04()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,20);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,30);

		 CalDay calday = new CalDay(cal);

		 int startHour=5;
		 int startMinute= 5;
		 int startDay=32;
		 int startMonth=0;
		 int startYear=2017;
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
		 Appt apptt = new Appt(2,2,25,4,2017,"a","b");

	  	 calday.addAppt(appt);
	  	 calday.addAppt(apptt);

		 timetable.getApptRange(calday.getAppts(),day1,day2);

		 assertNotNull(timetable.getApptRange(calday.getAppts(), day1, day2));
	 }
	 @Test
	  public void test05()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,28);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,29);

		 CalDay calday = new CalDay(cal);

	  	 Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	 Appt apptt = new Appt(2,2,2,2,2,"a","b");
	  	 Appt appttt = new Appt(3,3,3,3,3,"a","b"); 

	  	 calday.addAppt(appt);
	  	 calday.addAppt(apptt);
	  	 calday.addAppt(appttt);
	  	 LinkedList<Appt> appts = new LinkedList<Appt>();

		 timetable.deleteAppt(calday.getAppts(),appt);

		 assertEquals(2, calday.getSizeAppts());
	 }
	 @Test
	  public void test06()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,28);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,29);

		 CalDay calday = new CalDay(cal);

		 Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	 LinkedList<Appt> appts = new LinkedList<Appt>();
	  	 appts = null;

		 timetable.deleteAppt(appts,appt);

		 assertNotNull(timetable.getApptRange(calday.getAppts(), day1, day2));
	 }
	 @Test
	  public void test07()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,28);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,29);

		 CalDay calday = new CalDay(cal);

		 Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	 Appt apptt = new Appt(2,2,2,2,2,"a","b");
	  	 Appt appttt = new Appt(3,3,3,3,3,"a","b"); 

	  	 //calday.addAppt(appt);
	  	 calday.addAppt(apptt);
	  	 calday.addAppt(appttt);

	  	 appt = null;

		 timetable.deleteAppt(calday.getAppts(),appt);

		 assertNotNull(timetable.getApptRange(calday.getAppts(), day1, day2));
	 }
	 @Test
	  public void test08()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,28);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,29);

		 CalDay calday = new CalDay(cal);

		 Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	 Appt apptt = new Appt(2,2,2,2,2,"a","b");
	  	 Appt appttt = new Appt(3,3,3,3,3,"a","b"); 

	  	 //calday.addAppt(appt);
	  	 calday.addAppt(apptt);
	  	 calday.addAppt(appttt);

		 timetable.deleteAppt(calday.getAppts(),appt);

		 assertEquals(2, calday.getSizeAppts());
	 } 
	 @Test
	  public void test09()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,28);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,29);

		 CalDay calday = new CalDay(cal);

		 Appt appt = new Appt(-1,-1,-1,-1,-1,"a","b");
	  	 Appt apptt = new Appt(2,2,2,2,2,"a","b");
	  	 Appt appttt = new Appt(3,3,3,3,3,"a","b"); 

	  	 calday.addAppt(appt);
		 assertEquals(null,timetable.deleteAppt(calday.getAppts(),appt)) ;
	 } 
	 @Test
	  public void test10()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,28);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,29);

		 CalDay calday = new CalDay(cal);

		 Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	 Appt apptt = new Appt(2,2,2,2,2,"a","b");
	  	 calday.addAppt(appt);
	  	 calday.addAppt(apptt);
		 assertNotNull(timetable.deleteAppt(calday.getAppts(),appt)) ;
	 } 
	 @Test
	  public void test11()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,28);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,27);

		 CalDay calday = new CalDay(cal);

		 Appt appt = new Appt(1,1,1,1,1,"a","b");

		 Method m = timetable.getClass().getDeclaredMethod("getApptOccurences", Appt.class, GregorianCalendar.class, GregorianCalendar.class);
		 m.setAccessible(true);

		 assertNotNull(m.invoke(timetable, appt, day1, day2));
	 } 
	 @Test
	  public void test12()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,27);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,28);

		 CalDay calday = new CalDay(cal);

		 Appt appt = new Appt(1,1,5,1,2017,"a","b");
		 GregorianCalendar occurrenceDay = new GregorianCalendar(appt.getStartYear(), appt.getStartMonth(), appt.getStartDay());
		 LinkedList<GregorianCalendar> result = new LinkedList<GregorianCalendar>();

		 Method m = timetable.getClass().getDeclaredMethod("getApptOccurences", Appt.class, GregorianCalendar.class, GregorianCalendar.class);
		 m.setAccessible(true);
		 assertEquals(result, m.invoke(timetable, appt, day1, day2));
	 } 
	 @Test
	  public void test13()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,27);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,29);

		 CalDay calday = new CalDay(cal);

		 Appt appt = new Appt(1,1,4,28,2017,"a","b");
		 GregorianCalendar occurrenceDay = new GregorianCalendar(appt.getStartYear(), appt.getStartMonth(), appt.getStartDay());
		 LinkedList<GregorianCalendar> result = new LinkedList<GregorianCalendar>();
	  	 //result.add(occurrenceDay);
	  	 //calday.addAppt(appt);

		 Method m = timetable.getClass().getDeclaredMethod("getApptOccurences", Appt.class, GregorianCalendar.class, GregorianCalendar.class);
		 m.setAccessible(true);
		 assertEquals(result, m.invoke(timetable, appt, day1, day2));
	 }
	 @Test
	  public void test14()  throws Throwable  {
		 
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar cal = new GregorianCalendar();
		 GregorianCalendar day1 = new GregorianCalendar(2017,4,20);
		 GregorianCalendar day2 = new GregorianCalendar(2017,4,30);

		 CalDay calday = new CalDay(cal);

		 Appt appt = new Appt(1,1,4,25,2017,"a","b");
		 GregorianCalendar occurrenceDay = new GregorianCalendar(2017, 25, 4);
		 LinkedList<GregorianCalendar> result = new LinkedList<GregorianCalendar>();
	  	 //result.add(occurrenceDay);
	  	 //calday.addAppt(appt);

		 Method m = timetable.getClass().getDeclaredMethod("getApptOccurences", Appt.class, GregorianCalendar.class, GregorianCalendar.class);
		 m.setAccessible(true);
		 assertEquals(result, m.invoke(timetable, appt, day1, day2));
	 }
}