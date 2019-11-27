package encapsulation;
import java.util.*;
public class Encapsul {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student c=new Student();
		System.out.println("Enter Your Id:");
		c.setId(s.nextInt());
		System.out.println("Enter Your Name:");
		c.setName(s.next());
		System.out.println("ID:  "+c.getId());
		System.out.println("NAME:  "+c.getName());
	}
}
