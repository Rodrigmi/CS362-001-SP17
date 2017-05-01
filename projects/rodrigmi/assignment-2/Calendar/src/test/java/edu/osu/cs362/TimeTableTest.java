package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


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
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
		 TimeTable timetable = new TimeTable();

		 GregorianCalendar day1 = new GregorianCalendar();
		 GregorianCalendar day2 = new GregorianCalendar();
		 LinkedList<Appt> appts = new LinkedList<Appt>();

		 timetable.getApptRange(appts,day1,day2);
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
	 }
}