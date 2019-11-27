package Oops;

import java.util.Scanner;

class Register
{
	Scanner s=new Scanner(System.in);
	public static int[] booke=new int[25];
	String[] cc=new String[30];;
	String pr;
	int x=1;
	int i=1;
	int d;
	int b;
	int c;
	int e;
	int f;
	int total=0;
	public void registerr()
	{
		
		 System.out.println("Registration");
		    System.out.println("Enter your name");
		  cc[i]=s.next();
		     System.out.println("Enter your address");
		   String  address=s.next();
		     System.out.println("Contact Number");
		 String  contact=s.next();
		  System.out.println("E-Mail ID");
		  String   email=s.next();  
		     System.out.println("Enter proof type");
		   String  prooftype=s.next();  
		     System.out.println("Enter proof id");
		String proofid=s.next();  
	}
	
	public void book()
	{
		do
		{
		System.out.println("Do u want continue registration");
		String no=s.next();
		if(no.contentEquals("yes")==true)
		{
			System.out.println("Your Registration id is"+i);
			i++;
		}
		while(no.contentEquals("no")==true);
		System.out.println("Customer id and customer name");
		for(int k=1;k<i;k++)
		{
			System.out.print(k+"          " +cc[k]);
		}
		System.out.println("\n\nBooking:");
		System.out.println("Please choose the service required");
		System.out.println("AC/Non-AC(AC/nAC)");
		String ac=s.next();
		if(ac.contentEquals("AC")==true)
		{
			 b=1500;
		}
		else
		{
			 b=700;
		}
		System.out.println("Cot(Single/Double)");
		String cot=s.next();
		if(cot.contentEquals("Single")==true)
		{
			 c=50;
		}
		else
		{
			 c=100;
		}
		System.out.println("With cable connection/without cable connection(C/nC)");
		String cable=s.next();
		if(cable.contentEquals("C")==true)
		{
			 d=50;
		}
		else
		{
			 d=0;
		}
		System.out.println("Wi-Fi needed or not(W/nW)");
		String wifi=s.next();
		if(wifi.contentEquals("W")==true)
		{
			 e=200;
		}
		else
		{
			 e=0;
		}
		System.out.println("Laundry service needed or not(L/nL)");
		String laundry=s.next();
		if(laundry.contentEquals("L")==true)
		{
			 f=100;
		}
		else
		{
			 f=0;
		}
		
		int total=b+c+d+e+f;
		System.out.println("The total charge RS."+total);
		System.out.println("The services chosen are");
		System.out.println(ac);
		System.out.println(cot);
		System.out.println(cable);
		System.out.println(wifi);
		System.out.println(laundry);
		System.out.println("Do you want to proceed");
		pr=s.next();
		}while(pr.equals("no"));
		if(pr.contentEquals("yes")==true)
		{
			booke[x]=1;
			System.out.println("Thank you your room number is"+x);
			x=x+1;
		}
	}	
}
public class Customer {

	public static void main(String[] args) {
		Register r=new Register();
		r.registerr();
		r.book();
		r.viewbook();
	}
}