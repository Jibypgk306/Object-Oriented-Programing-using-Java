package Inheritance;
import java.util.Scanner;
public class Fresh {
	public static void main(String[] args) {
		  {
		   Scanner sc=new Scanner(System.in);
		   Account ob=new Account();
		    System.out.println("1.Current Account\n2.Savings Account");
		    int ch=sc.nextInt();
		    System.out.println("Name");
		    String name=sc.next();
		    System.out.println("Account number");
		    int accno=sc.nextInt();
		    System.out.println("Account balaence");
		    int accbal=sc.nextInt();
		    System.out.println("Date");
		    int startdate=sc.nextInt();
		    System.out.println("Year");
		    int year=sc.nextInt(); 
		    switch(ch)
		    {
		      case 1:
		      ob.current();
		      break;
		      case 2:
		      ob.savings();
		      break;
		      default :System.out.println("Invalid");
		      break;
		    }
		      }
		                 }
		    interface Details{
		      public void current();
		    }
		    interface Display {
		      public void savings();
		    }
		       class Acc implements Details,Display
		       {
		       public void current()
		       {
		         System.out.println("Maintainence charge for Current Account 400.00");
		       }
		       public void savings(String name,int accno,int accbal,int startdate,int year)
		       {
		         System.out.println("Maintainence charge for savings Account 550.00");
		       }
		     }
	}
