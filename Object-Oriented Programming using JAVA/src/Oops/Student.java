package Oops;
import java.util.*;
class Person
{
	Scanner s=new Scanner(System.in);
	public void detail()
	{
	System.out.println("ENTER THE NAME");
	String sname=s.nextLine();
	System.out.println("ENTER THE ROLL NUMBER");
	int sroll=s.nextInt();
	System.out.println(sname);
	System.out.println(sroll);
	}
	public void mark()
	{
	System.out.println("ENTER THE MARKS");
	int mark1=s.nextInt();
	int mark2=s.nextInt();
	int mark3=s.nextInt();
	int total=mark1+mark2+mark3;
	System.out.println(total);
	}
}
public class Student {

	public static void main(String[] args) {
		Person p=new Person();
		p.detail();
		p.mark();
	}

}