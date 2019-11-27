package inhercase1;
import java.util.*;
class Booking
{
public void booking()
{
	System.out.println("BOOKING");
}
}
class Seasonbook extends Booking
{
 void details(int n1, int d1, int t1, String r1)
	{
	 int total=n1*d1+t1;
	System.out.println(total);
}
}
public class Inher {
	public static void main(String[] args) {
		Seasonbook e=new Seasonbook();
		System.out.println("Booking");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of persons");
		int n1=s.nextInt();
		System.out.println("Enter the number of days");
		int d1=s.nextInt();
		System.out.println("Enter the amount of tarrif");
		int t1=s.nextInt();
		System.out.println("Enter the room type");
		String r1=s.next();
		e.booking();
		e.details(n1,d1,t1,r1);
	}
}