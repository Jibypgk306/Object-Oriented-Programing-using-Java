package Inheritance;
import java.util.*;
public class Main {
public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=s.next();
		System.out.println("Enter Telephone bill number:");
		int billno=s.nextInt();
		System.out.println("Enter Number of calls made:");
		int number=s.nextInt();
		System.out.println("Enter cost per call:");
		int cost=s.nextInt();
		System.out.println("Enter current bill number:");
		int cubill=s.nextInt();
		System.out.println("Enter customer name:");
		String na=s.next();
		System.out.println("Enter number of units consumed:");
		int unit=s.nextInt();
		System.out.println("Enter cost per unit:");
		int costu=s.nextInt();
		Bill b=new Bill();
		Telephonebill t=new Telephonebill();
		Currentbill cu=new Currentbill();
		b.bill(billno,name);
		t.bill(number, cost);
		cu.bill(unit,costu,cubill);
	}

}
class Bill
{
	public void bill(int billno,String name)
{
		System.out.println("Bill number::"+billno);
		System.out.println("Customer Name::"+name);
}
	
}
class Telephonebill extends Bill
{
	public void bill(int number,int cost)
	{
		System.out.println("Cost per call:"+cost);
		System.out.println(" Number of calls::"+number);
		int amountt=number*cost;
		System.out.println("Telephone bill amount:"+amountt);
	}
}
class Currentbill extends Bill
{
	public void bill(int unit,int costu,int cubill)
	{
		System.out.println("Bill number::"+cubill);
		System.out.println("Unit::"+unit);
		System.out.println("costu"+costu);
		int amount=unit*costu;
		System.out.println("Current bill amount:"+amount);

		
	}
}