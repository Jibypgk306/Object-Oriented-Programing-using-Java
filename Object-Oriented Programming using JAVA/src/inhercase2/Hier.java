package inhercase2;
import java.util.*;
class Booking
{
	int tot;
	double Booker(int n1, int da, int t1) {
		tot = n1 * da * t1;
		return tot;
		}
}
class Peakseson extends Booking
{	
	int charge=200;
 void details1(int persons, int days, int tariff, String roomType, int month ,int peakCharges)
	{
	 if( month==4||month==6)
	 {
	 int total=charge*persons*tariff;
	System.out.println(total);
}
	}
}
class Leanseson extends Booking
{
	
 void details(int persons, int days,int tariff, int month2 , int dis, int dis2)
	{
	 if(month2==1||month2==2)
	 {
	 int total=persons*days;
	System.out.println(total);
	 }
}
}
public class Hier {
public static void main(String[] args) {
		Leanseson e=new Leanseson();
		//Peakseson p=new Peakseson();
		System.out.println("Booking");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of persons");
		int n1=s.nextInt();
		System.out.println("Enter the number of days");
		int da=s.nextInt();
		System.out.println("Enter the amount of tarrif");
		int t1=s.nextInt();
		System.out.println("Enter the month");
		int month=s.nextInt();
		
		System.out.println("Enter the room type");
		int dis=s.nextInt();
		Lean bg = new Lean();
		Peak bg1 = new Peak();
		int cd = bg.Booking(n1, da, t1);
		switch (month) {
		case 4:
		case 5:
		case 6:
		case 9:
		case 11:
		case 12:
		bg1.Peakseson(cd);
		break;

		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 10:
		bg.leanseson(cd);
		break;

		}
		
	}
}