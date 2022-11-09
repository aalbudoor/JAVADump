package NumbersAndStatic;
import java.util.Calendar;

import sun.util.calendar.CalendarDate;

public class CalenderObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c = Calendar.getInstance();
		
		//set time to jan 7, 2004, at 15:40 (notice month is zero based)
		c.set(2004, 0, 7 , 15, 40);
		
		//convert to amount of miliseconds
		long day1 = c.getTimeInMillis();
		
		//millisecond, minutes and hour 
		day1 += 1000 * 60 * 60; 
		
		c.setTimeInMillis(day1); //add an hours worth of millis, then update the time (notice +=)
		
		
		System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
		
		c.add(c.DATE, 35); //Add 35 days to the date, which should move us into feburary
		
		System.out.println("add 35 days " + c.getTime());
		
		c.roll(c.DATE, 35); //"roll" 35 days onto this date. this "rolls" the date ahead 35 days but does not change the month
		
		System.out.println("roll 35 days " + c.getTime());
		
		c.set(c.DATE, 1); // we are not incrementing here just doing a set of the date
		
		System.out.println("set to 1 " + c.getTime());
		
		

	}

}
