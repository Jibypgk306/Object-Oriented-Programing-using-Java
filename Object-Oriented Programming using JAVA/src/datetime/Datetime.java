package datetime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Datetime {

	public static void main(String[] args) 
	{
		System.out.println("Today date");
		LocalDate date=LocalDate.now();//date
		System.out.println(date);
		System.out.println("Current date");
		LocalTime time=LocalTime.now();//time
		System.out.println(time);
		System.out.println("Today date and time");
		LocalDateTime dt=LocalDateTime.now();//date & time
		System.out.println(dt);
		DateTimeFormatter format=DateTimeFormatter.ofPattern
			("E,MMM:dd :yyyy:hh:mm:ss");//E->day
		String formatdate=dt.format(format);
		System.out.println("After Formatting: "+formatdate);

	}
}
