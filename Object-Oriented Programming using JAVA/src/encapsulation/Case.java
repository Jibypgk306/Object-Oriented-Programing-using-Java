package encapsulation;
import java.util.*;
public class Case {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=1;
		Stud t=new Stud();
		Display d=new Display();
		System.out.println("Enter Name:");
		t.setName(s.next());
		System.out.println("Enter Adress:");
		t.setAdres(s.next());
		System.out.println("Enter Email:");
		t.setEmail(s.next());
		System.out.println("Enter Contact Number:");
		t.setNumber(s.nextInt());
		System.out.println("Enter Proof type:");
		t.setProof(s.next());
		System.out.println("Enter Proof ID:");
		t.setProofid(s.nextInt());
		d.showdetails(t.getName(),t.getAdres(),t.getEmail(),t.getNumber(),t.getProof(),t.getProofid());
		System.out.println("Thank you for registering...!! Your Id is:"+i);
	}

}
