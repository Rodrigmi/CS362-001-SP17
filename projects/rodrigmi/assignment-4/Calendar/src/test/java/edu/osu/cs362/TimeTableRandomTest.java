package edu.osu.cs362;

import java.util.*;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
    private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"getApptRange","deleteAppt"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		 
		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed =10;//System.currentTimeMillis();
			 //System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);

			 for (int i = 0; i < NUM_TESTS; i++) {
				 int startHour=ValuesGenerator.getRandomIntBetween(random,-1,25);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random,-1,60);
				 int startDay=ValuesGenerator.getRandomIntBetween(random,-1,32);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random,-1,13);
				 int startYear=ValuesGenerator.getRandomIntBetween(random,0,2017);		 
				 int cDay=ValuesGenerator.getRandomIntBetween(random,1,31);
				 int cMonth=ValuesGenerator.getRandomIntBetween(random,10,12);
				 int cYear=ValuesGenerator.getRandomIntBetween(random,0,2017);
				 String title="Birthday Party";
				 String description="This is my birthday party.";

				 int startHourr=ValuesGenerator.getRandomIntBetween(random,-1,25);
				 int startMinutee=ValuesGenerator.getRandomIntBetween(random,-1,60);
				 int startDayy=ValuesGenerator.getRandomIntBetween(random,-1,32);
				 int startMonthh=ValuesGenerator.getRandomIntBetween(random,-1,13);
				 int startYearr=ValuesGenerator.getRandomIntBetween(random,0,2017);		 
				 int cDayy=ValuesGenerator.getRandomIntBetween(random,1,31);
				 int cMonthh=ValuesGenerator.getRandomIntBetween(random,10,12);
				 int cYearr=ValuesGenerator.getRandomIntBetween(random,0,2017);
				 String titlee="Birthday Party";
				 String descriptionn="This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 GregorianCalendar cal = new GregorianCalendar(cDay,cMonth,cYear);
				 GregorianCalendar call = new GregorianCalendar(cDayy,cMonthh,cYearr);
	  			 CalDay calday = new CalDay(cal);	
	  			 TimeTable timeTable = new TimeTable(); 
				 
				 Appt appt = new Appt(startHour,startMinute,startDay,startMonth,startYear,title,description);
				 Appt apptt = new Appt(startHourr,startMinutee,startDayy,startMonthh,startYearr,titlee,descriptionn);

				 String methodName = TimeTableRandomTest.RandomSelectMethod(random);

				 if (methodName.equals("deleteAppt")){
				 	 calday.addAppt(appt);
				  	 calday.addAppt(apptt);
				  	 Appt ranappt = ValuesGenerator.getRandomIntBetween(random,0,10)==5 ? new Appt(startHour,startMinute,startDay,startMonth,startYear,title,description):null;
					 timeTable.deleteAppt(calday.getAppts(),ranappt);
					}	
				 else{
				 	 calday.addAppt(appt);
				  	 calday.addAppt(apptt);
				 	 LinkedList<Appt> appts = ValuesGenerator.getRandomIntBetween(random,0,10)==5 ? calday.getAppts():null;
					 timeTable.deleteAppt(appts,appt);
				}										
			}
			
			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
		        if((iteration%10000)==0 && iteration!=0 )
		              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
	 System.out.println("Done testing...");
 	}	
}