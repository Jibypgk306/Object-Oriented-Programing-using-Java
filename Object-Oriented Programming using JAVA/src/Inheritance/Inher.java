package Inheritance;
import java.util.*;
class Car1
{
	public void name()
	{
		System.out.println("TOYOTO");
	}
}
class Car2 extends Car1
{
	
	public void model(int a)
	{
		System.out.println(" Model=>"+a);
	}
}

public class Inher {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("WELCOME...");
		System.out.println("Enter the model:");
		int a=s.nextInt();
		Car2 c=new Car2();
		c.name();
		c.model(a);
	}

}
