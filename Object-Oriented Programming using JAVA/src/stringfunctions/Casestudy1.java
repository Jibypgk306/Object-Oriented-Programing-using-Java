package stringfunctions;

import java.util.Scanner;
public class Casestudy1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		StringBuffer sc=new StringBuffer();
		System.out.println("Registration");
		System.out.println("Enter your name");
		sc.append(s.next()+"\n");
		    System.out.println("Enter your address");
			sc.append(s.next()+"\n");
		    System.out.println("Contact Number");
			sc.append(s.next()+"\n");
		 System.out.println("E-Mail ID");
			sc.append(s.next()+"\n");  
		    System.out.println("Enter proof type");
			sc.append(s.next()+"\n");
 
		    System.out.println("Enter proof id");
			sc.append(s.next()+"\n");
		
		   System.out.println("Thank you for registering. Your id is 1...");
		   System.out.println("Do you want to continue registration?(y/n)");
		   sc.append(s.next()+"\n");
		   String email1;
		if (s.next().equals("n")==true ||s.next().equals("y")==true)
		{
			System.out.println("Do you want to update the email id?(yes/no)");
		
		   String ye=s.next();
		   if(ye.equals("y")==true) {
		   System.out.println("Update Email");
		   System.out.println("Enter new Email id:");
		    email1=s.next();
		   String email = email1;
		   System.out.println("Email updated");
		}  
		   System.out.println("Your details are as follows");
			System.out.println(sc);

	}
}
}
