package stringfunctions;
import java.util.*;
public class Empdetails {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("Enter the employee id");
		System.out.println("Enter the name");
		s.append("Name ->  "+sc.next()+"\n");
		System.out.println("Enter the ID number");
		s.append("Employee ID ->  "+sc.next()+"\n");
		System.out.println("Enter the Position");
		s.append("Position ->  "+sc.next()+"\n");
		System.out.println("Enter the Salary");
		s.append("Salary ->  "+sc.next()+"\n");
		s.deleteCharAt(1);
		
		System.out.println(s);
	}
}