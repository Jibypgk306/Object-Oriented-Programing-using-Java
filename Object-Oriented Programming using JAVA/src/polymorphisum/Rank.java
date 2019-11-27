package polymorphisum;
import java.util.*;
public class Rank {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Name:");
	String name=s.next();
	System.out.println("Roll number:");
	int roll=s.nextInt();
	System.out.println("Department:");
	String de=s.next();
	System.out.println("Mark1:");
	int mark1=s.nextInt();
	System.out.println("Mark2:");
	int mark2=s.nextInt();
	System.out.println("Mark3:");
	int mark3=s.nextInt();
	System.out.println("Mark4:");
	int mark4=s.nextInt();
	System.out.println("Mark5:");
	int mark5=s.nextInt();
	int avg;
	int rank;
	Stud t=new Stud();
	t.details(name,roll,de);
	t.details(mark1,mark2,mark3,mark4,mark5);
	}
}
class Stud
{
	public void details(String name, int roll, String de)
	{
		System.out.println("\n*****Your Report****\n");
		System.out.println("Name:"+name);
		System.out.println("Roll number:"+roll);
		System.out.println("Department:"+de);
	}
	public void details(int mark1, int mark2, int mark3, int mark4, int mark5)
	{
		int avg=(mark1+mark2+mark3+mark4+mark5)/5;
		System.out.println("Average:"+avg);
		if(avg>400)
		{
			System.out.println("You are in First Rank");
		}
		else if(avg>=300)
		{
			System.out.println("You are in Second Rank");
		}
		else if(avg<300)
		{
			System.out.println("You are Fail...!!");
			}
		}	
	}