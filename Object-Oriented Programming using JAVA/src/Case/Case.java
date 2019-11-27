package Case;
import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Booking b=new Booking();
		b.book();
	}
}class Booking
{
	
public static int booked[]=new int[25];
static void book()
{
	String ac,pr;
	String cot;
	String cable;
	String wifi;
	String laundry;
	Scanner sc=new Scanner(System.in);
	int total=0,b=0,c,d,e,f,i=1;
	do
	{
	System.out.println("Booking:");
	System.out.println("Please choose the service required");
	System.out.println("AC/Non-AC(AC/nAC)");
	ac=sc.next();
	if(ac.contentEquals("AC")==true)
	{
		b=1500;
	}
	else
	{
		b=700;
	}
	System.out.println("Cot(Single/Double)");
	cot=sc.next();
	if(cot.contentEquals("Single")==true)
	{
		c=50;
	}
	else
	{
		c=100;
	}
	System.out.println("With cable connection/without cable connection(C/nC)");
	cable=sc.next();
	if(cable.contentEquals("C")==true)
	{
		d=50;
	}
	else
	{
		d=0;
	}
	System.out.println("Wi-Fi needed or not(W/nW)");
	wifi=sc.next();
	if(wifi.contentEquals("W")==true)
	{
		e=200;
	}
	else
	{
		e=0;
	}
	System.out.println("Laundry service needed or not(L/nL)");
	laundry=sc.next();
	if(laundry.contentEquals("L")==true)
	{
		f=100;
	}
	else
	{
		f=0;
	}
	total=b+c+d+e+f;
	System.out.println("The total charge RS."+total);
	System.out.println("The services chosen are");
	System.out.println(ac);
	System.out.println(cot);
	System.out.println(cable);
	System.out.println(wifi);
	System.out.println(laundry);
	System.out.println("Do you want to proceed");
	pr=sc.next();
	}while(pr.equals("no"));
	if(pr.contentEquals("yes")==true)
	{
		booked[i]=1;
		System.out.println("Thank you your room number is"+i);
		i=i+1;
	}
}
}