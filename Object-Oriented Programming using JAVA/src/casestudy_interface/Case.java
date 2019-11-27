package casestudy_interface;
import java.util.*;

public class Case {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Registration");
		System.out.println("Enter your name");
		 String name=s.nextLine();
		    System.out.println("Enter your address");
		  String  address=s.nextLine();
		    System.out.println("Contact Number");
		String  contact=s.nextLine();
		 System.out.println("E-Mail ID");
		 String   email=s.nextLine();  
		    System.out.println("Enter proof type");
		  String  prooftype=s.nextLine();  
		    System.out.println("Enter proof id");
		String proofid=s.nextLine(); 
		 Student ss = new Student();
	        ss.detail(name,address,contact,email,prooftype,proofid);
		   System.out.println("Thank you for registering. Your id is 1...");
		   System.out.println("Do you want to continue registration?(y/n)");
		   String pr = s.next();
		   String email1;
		if (pr.equals("n")==true || pr.equals("y")==true)
		{
			System.out.println("Do you want to update the email id?(yes/no)");
		
		   String ye=s.next();
		   if(ye.equals("y")==true) {
		   System.out.println("Update Email");
		   System.out.println("Enter new Email id:");
		    email1=s.next();
		   email=email1;
		   System.out.println("Email updated");
		}  
		   System.out.println("Your details are as follows");
		   System.out.println(name);
		   System.out.println(address);
		   System.out.println(contact);
		   System.out.println(email);
		   System.out.println(prooftype);
		   System.out.println(proofid);
	}
}
}
interface stud{
    public  void detail(String name,String address,String contact,String email,String prooftype,String proofid);
}
class Student implements stud
{
   public  void detail(String name,String address,String contact,String email,String prooftype,String proofid) {
	   System.out.println("Name:"+name);
	   System.out.println("Adress"+address);
	   System.out.println("Contact"+contact);
	   System.out.println("Email id"+email);
	   System.out.println("Proof type"+prooftype);
	   System.out.println("proofid"+proofid);
}
}
