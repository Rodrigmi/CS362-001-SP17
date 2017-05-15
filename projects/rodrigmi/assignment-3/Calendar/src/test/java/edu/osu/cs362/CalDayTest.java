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

	  	assertEquals(false, calday.isValid());  	
	 }
	 @Test
	 public void test02()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);

	  	assertEquals(true, calday.isValid()); 	
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

	  	GregorianCalendar cal = new GregorianCalendar(2017,4,28);

	  	CalDay calday = new CalDay(cal);
	  
	  	assertNotNull(calday.getAppts());
	  	assertEquals(0, calday.getSizeAppts());
	  	assertEquals(28, calday.getDay());
	  	assertEquals(4, calday.getMonth());
	  	assertEquals(2017, calday.getYear());
	  	assertNotNull(calday.toString());	
	 }
	 @Test
	 public void test05()  throws Throwable  {

	  	CalDay calday = new CalDay();
	  	calday.toString();
	  	
	  	assertEquals(false, calday.isValid());	 	
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

	  	assertEquals(3, calday.getSizeAppts());
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

	  	assertEquals(3, calday.getSizeAppts());
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

	  	assertEquals(true, calday.isValid());	
	 }
	 @Test
	 public void test10()  throws Throwable  {

	  	CalDay calday = new CalDay();
	  	calday.iterator();

	  	assertEquals(false, calday.isValid());	
	 }
	 @Test
	 public void test11()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);
	  	Appt appt = new Appt(1,1,1,1,1,"a","b");
		          
	  	calday.addAppt(appt);

	  	assertEquals(1, calday.getSizeAppts());
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

	  	assertEquals(true, calday.isValid());
	  	assertEquals(3, calday.getSizeAppts());	
	 }
	 @Test
	 public void test13()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);
	  	Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	Appt apptt = new Appt(1,1,1,1,1,"a","b");
	  	Appt appttt = new Appt(1,1,1,1,1,"a","b");
		          
	  	calday.addAppt(appt);
	  	calday.addAppt(apptt);
	  	calday.addAppt(appttt);

	  	assertEquals(3, calday.getSizeAppts());
	 }
	  @Test
	 public void test14()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();
	  	CalDay calday = new CalDay(cal);

	  	//GregorianCalendar call = new GregorianCalendar();
	  	//CalDay caldayy = new CalDay(call);

	  	//Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	//Appt apptt = new Appt(1,1,1,1,1,"a","b");
	  	//Appt appttt = new Appt(1,1,1,1,1,"a","b");
	  	//Appt apptttt = new Appt(1,1,1,1,1,"a","b");
		          
	  	//calday.addAppt(appt);
	  	//caldayy.addAppt(apptt);
	  	//calday.addAppt(appttt);
	  	//caldayy.addAppt(apptttt);
	  	LinkedList<Appt> appts = new LinkedList<Appt>();
	  	appts = null;
	  	Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	calday.addAppt(appt);
	  	Method m = calday.getClass().getDeclaredMethod("setAppts", LinkedList.class);
		m.setAccessible(true);
		m.invoke(calday, appts);

	  	assertNotNull(calday.getAppts());
	  	assertEquals(1, calday.getSizeAppts());
	 }
	 @Test
	 public void test15()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);
	  	Appt appt = new Appt(1,1,1,1,1,"a","b");
	  	Appt apptt = new Appt(2,2,2,2,2,"a","b");          
	  	
	  	calday.addAppt(apptt);
	  	calday.addAppt(appt);

	  	assertEquals(2, calday.getSizeAppts());
	  	assertFalse(((Appt)calday.getAppts().get(0)).toString().contains("2"));
	 }
	 @Test
	 public void test16()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();

	  	CalDay calday = new CalDay(cal);
	  	Appt appt = new Appt(2,3,1,1,1,"a","b");
	  	Appt apptt = new Appt(2,4,2,2,2,"a","b");          
	  	
	  	calday.addAppt(apptt);
	  	calday.addAppt(appt);

	  	assertEquals(2, calday.getSizeAppts());
	  	assertFalse(((Appt)calday.getAppts().get(0)).toString().contains("3"));
	 }
	 @Test
	 public void test17()  throws Throwable  {

	  	GregorianCalendar cal = new GregorianCalendar();
	  	CalDay calday = new CalDay(cal);		          
	  	calday.iterator();

	  	assertNotNull(calday.iterator());	
	 }

	
}