package polymorphisum;
import java.util.*;
public class Myexample {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Name:");
	String name=s.next();
	System.out.println("housename");
	String ho=s.next();
	System.out.println("place");
	String pl=s.next();
	System.out.println("number of books you want:");
	int bo =s.nextInt();
	My t=new My();
	t.details(name);
	t.details(ho,pl,bo);
	}
}
class My
{
	public void details(String name)
	{
		System.out.println("\n*****Your Enterd Details****\n");
		System.out.println("Name:"+name);
	}
	public void details(String ho,String pl,int bo)
	{
		System.out.println("Housename:"+ho);
		System.out.println("Place:"+pl);
		System.out.println("Number of books:"+bo);
	}	
	}