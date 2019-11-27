package encapsulation;
import java.util.*;
public class case2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=1;
		cust t=new cust();
		View v=new View();
		do {
		System.out.println("Enter Name:");
		t.setName(s.next());
		System.out.println("Enter Adress:");
		t.setAdres(s.next());
		System.out.println("Enter Email:");
		t.setEmail(s.next());
		System.out.println("Enter Contact Number:");
		t.setNumber(s.next());
		System.out.println("Enter Proof type:");
		t.setProof(s.next());
			}while(t.getName()==null || t.getAdres()==null || t.getEmail()==null || t.getNumber()==null||t.getProof()==null);
		if(t.getName()!=null||t.getAdres()!=null || t.getEmail()!=null || t.getNumber()!=null||t.getNumber()!=null||t.getProof()!=null)
		{
		v.showdetails(t.getName(),t.getAdres(),t.getEmail(),t.getNumber(),t.getProof());
		System.out.println("Thank you for registering...!! Your Id is:"+i);
	}
		else
		{
			System.out.println("Registration Failed");

		}
	}

}
