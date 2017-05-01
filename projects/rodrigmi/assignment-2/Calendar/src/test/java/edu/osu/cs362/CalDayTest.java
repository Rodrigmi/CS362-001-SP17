package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.lang.reflect.*;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	 public void test01()  throws Throwable  {

	  	CalDay calday = new CalDay();  	
	 }
	 @Test
	 public void test02()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);	
	 }
	 /*@Test
	 public void test03()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();
	  	LinkedList<Appt> appts = new LinkedList<Appt>();
	  	appts = null;



	  	Class[] cArg = new Class[1];
	  	cArg[0] = LinkedList.class;

	  	Method m = CalDay.class.getDeclaredMethod("setAppts",cArg);
        m.setAccessible(true);//Abracadabra
        m.invoke(m, appts); // Now it's OK

	  	//calday.setAppts(appts);
	 }*/
	 @Test
	 public void test04()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);
	  
	  	calday.getAppts();
	  	calday.getSizeAppts();
	  	calday.getDay();
	  	calday.getMonth();
	  	calday.getYear();
	  	calday.toString();	
	 }
	 @Test
	 public void test05()  throws Throwable  {

	  	CalDay calday = new CalDay();
	  	calday.toString();  	
	 }
	 @Test
	 public void test06()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);
	  	Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	Appt apptt = new Appt(2,2,2,2,2,"a","b");
	  	Appt appttt = new Appt(3,3,3,3,3,"a","b");
		          
	  	calday.addAppt(appt);
	  	calday.addAppt(apptt);
	  	calday.addAppt(appttt);
	 }
	 @Test
	 public void test07()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);
	  	Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	Appt apptt = new Appt(2,2,2,2,2,"a","b");
	  	Appt appttt = new Appt(3,3,3,3,3,"a","b");
		          
	  	calday.addAppt(appttt);
	  	calday.addAppt(apptt);
	  	calday.addAppt(appt);
	 }
	  @Test
	 public void test08()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);
	  	Appt appt = new Appt(-1,-1,-1,-1,-1,"","");
		          
	  	calday.addAppt(appt);
	 }
	 @Test
	 public void test09()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();
	  	CalDay calday = new CalDay(cal);		          
	  	calday.iterator();
	 }
	 @Test
	 public void test10()  throws Throwable  {

	  	CalDay calday = new CalDay();
	  	calday.iterator();
	 }
	 @Test
	 public void test11()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);
	  	Appt appt = new Appt(1,1,1,1,1,"a","b");
		          
	  	calday.addAppt(appt);
	 }
	 @Test
	 public void test12()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);
	  	Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	Appt apptt = new Appt(2,2,2,2,2,"a","b");
	  	Appt appttt = new Appt(3,3,3,3,3,"a","b");
		          
	  	calday.addAppt(appt);
	  	calday.addAppt(apptt);
	  	calday.addAppt(appttt);
	  	calday.toString();	
	 }

	
}