package Inheritance;
import java.util.*;
public class Multilevel {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the models");
	String a=s.nextLine();
	String b=s.nextLine();
	Colour1 g=new Colour1();
	g.models(a,b);
	g.colo();
	g.casee();
	}
}
class Sam
{
	public void models(String a,String b)
	{
		System.out.println("model:"+a+"\n"+b);
	}
}
class Co extends Sam
{
	public void colo()
	{		
		System.out.println("These are the Colors of phone Available:");
		System.out.println("RED");
		System.out.println("PINK");
		System.out.println("BLACK");
		System.out.println("GREY");
	}
}
class Colour1 extends Co
{
	public void casee()
	{		
		System.out.println("These are the colours of  Cases Available:");
		System.out.println("RED");
		System.out.println("PINK");
		System.out.println("BLACK");
		System.out.println("GREY");
	}
}

