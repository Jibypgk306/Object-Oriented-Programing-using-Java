package Inheritance;
import java.util.*;
public class Phone {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the models");
	String a=s.nextLine();
	String b=s.nextLine();
	Colour c=new Colour();
	c.models(a,b);
	c.colo();
	}
}
class Samsung
{
	public void models(String a,String b)
	{
		System.out.println("model:"+a+"\n"+b);
	}
}
class Colour extends Samsung
{
	public void colo()
	{		
		System.out.println("These are the Colors Available:");
		System.out.println("RED");
		System.out.println("PINK");
		System.out.println("BLACK");
		System.out.println("GREY");
	}
}

