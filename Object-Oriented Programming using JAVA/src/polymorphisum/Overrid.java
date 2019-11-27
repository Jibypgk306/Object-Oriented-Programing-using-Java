package polymorphisum;
import java.util.*;
public class Overrid {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	//Myy t=new Myy();
	Demo g=new Demo();
	//t.details();
	g.details();
	}
}
class Myy
{
	public void details()
	{
		System.out.println("Parent class");
	}
	}
class Demo extends Myy
{
	public void details()
	{
		super.details();
		System.out.println("Child class");
		
	}	
}