package datetime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Casestudy {

	public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
		Calendar calendar=Calendar.getInstance();
		int a,b;
		int person;
		int rooms;
		do {
		System.out.println("Enter the Name");
		String name=s.next();
		System.out.println("Enter the Adress");
		String adres=s.next();
		System.out.println("Enter the Number of rooms");
		rooms=s.nextInt();
		System.out.println("Enter the Number of Person");
		 person=s.nextInt();
		System.out.println("AC/Non AC:(Yes Or No");
		String ac=s.next();
		System.out.println("Booking Date");
		String start =s.next();
		 LocalDate ds = LocalDate.parse(start);
		System.out.println("Check out Date");
		String end = s.next();
		LocalDate de = LocalDate.parse(end);
		long total = ChronoUnit.DAYS.between(ds,de);
		
		if(ac.contentEquals("yes")==true)
		{
			 b=1150;
		}
		else
		{
			 b=1000;
		}
		int amount=(int) (b*total*rooms);
		System.out.println("...Registration Details..");
		System.out.println("Name: "+name);
		System.out.println("Adress:"+adres);
		System.out.println("Name: "+name);
		System.out.println("Number of room: "+rooms);
		System.out.println("Number of guest: "+person);
		System.out.println("AC: "+ac);
		System.out.println("Number of days: "+total);
		System.out.println("Amount: "+amount);
		}while(person>rooms);
	}
}