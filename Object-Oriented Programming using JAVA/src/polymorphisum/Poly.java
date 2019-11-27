package polymorphisum;
import java.util.*;
public class Poly {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("First Number:");
		int n1=s.nextInt();
		System.out.println("Second Number:");
		int n2=s.nextInt();
		System.out.println("Third Number:");
		int n3=s.nextInt();
		Add d=new Add();
		d.add(n1);
		d.add(n1,n2);
		d.add(n1,n2,n3);
	}
}
class Add
{
	
	public void add(int n1,int n2)
	{
		System.out.println("The sum of two number:"+(n1+n2));
	}
	public void add(int n1) {
		// TODO Auto-generated method stub
		System.out.println("The First number:"+n1);

	}
	public void add(int n1,int n2,int n3)
	{
		System.out.println("The Sum of three number:"+(n1+n2+n3));
	}
	
}
