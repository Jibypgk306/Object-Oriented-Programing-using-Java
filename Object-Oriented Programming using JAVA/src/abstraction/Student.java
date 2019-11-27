package abstraction;
import java.util.*;
public class Student {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Name:");
		String name=s.next();
		System.out.println("Roll number:");
		int roll=s.nextInt();
		System.out.println("Percentage:");
		int per=s.nextInt();
		Stud t=new Stud();
		t.details(name,roll,per);
	}
}
abstract class Detail
{
	abstract void details(String name,int roll,int per);
	
		public void show()
		{
			System.out.println("Rank2");			
		}
}
class Stud extends Detail
{
	void details(String name,int roll,int per)
	{
		System.out.println("Name   :"+name);
		System.out.println("Rollno :"+roll);
		System.out.println("Percentage  :"+per);
		super.show();
	}
}