package car;
import java.util.*;
public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name:");
		String str=s.next();
		Carnew c=new Carnew();
		Carnew.dis(str);
		Carnew.a();
		Carnew.b();
	}
}
class Carnew
{
	String str;
	public static void dis(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	public static void a() {
		// TODO Auto-generated method stub
		System.out.println("Welcome car m");
	}

	

	public static void b() {
		// TODO Auto-generated method stub
		System.out.println("Welcome car Model");
	}
	
}
