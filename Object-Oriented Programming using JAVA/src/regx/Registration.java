package regx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern paswordpattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		
		System.out.println("Enter name");
		String namee=s.next();
		Pattern name=Pattern.compile("[A-Z][a-z]*");
		Matcher na=	name.matcher(namee);
		if(na.matches()) //result set for matcher class
		{
			System.out.println("Valid Name");
		}
		else
		{
			System.out.println("InValid Name");
		}
		System.out.println("Enter Email Id");
		String email=s.next();
		Pattern emailpattern = Pattern.compile(regex);
		Matcher em=	emailpattern.matcher(email);
		if(em.matches()) //result set for matcher class
		{
			System.out.println("Valid Email ID");
		}
		else
		{
			System.out.println("InValid Email ID");
		}
		
		System.out.println("Enter Reg id");
		String reg=s.next();
		Pattern regidpattern = Pattern.compile("[0-9]");
		Matcher id=	regidpattern.matcher(reg);
		if(id.matches()) //result set for matcher class
		{
			System.out.println("Valid ID");
		}
		else
		{
			System.out.println("InValid ID");
		}
		
		System.out.println("Enter Rank");
		String rank=s.next();
		Pattern rankpattern = Pattern.compile("[0-9]");
		Matcher ra=	rankpattern.matcher(rank);
		if(ra.matches()) //result set for matcher class
		{
			System.out.println("Valid Rank");
		}
		else
		{
			System.out.println("InValid rank");
		}
		
		System.out.println("Enter Year");
		String year=s.next();
		Pattern yearpattern = Pattern.compile("[0-9]");
		Matcher ye=	yearpattern.matcher(year);
		if(ye.matches()) //result set for matcher class
		{
			System.out.println("Valid year");
		}
		else
		{
			System.out.println("InValid year");
		}
		
		System.out.println("Enter Department");
		String dept=s.next();
		Pattern deptpattern = Pattern.compile("[A-Z][.][a-z]*");
		Matcher de=	deptpattern.matcher(dept);
		
		
		if(de.matches()) //result set for matcher class
		{
			System.out.println("Valid department name");
		}
		else
		{
			System.out.println("InValid dept name");
		}
		if
		(em.matches()&&na.matches()&&id.matches()
		&&ra.matches()&&ye.matches()&&de.matches())
		{
		System.out.println("**Login**");
		System.out.println("E-Mail:"+email);
		System.out.println("Enter password here..");
		String password=s.next();
		Matcher mtch=paswordpattern.matcher(password);
		if(mtch.matches()) //result set for matcher class
		{
		System.out.println("Valid Password");

		System.out.println("Successfully Registerd");
		}
		else
		{
		System.out.println("InValid Password");
		}
		}	
		else
		{
	System.out.println("Sorry We cant Register you..Some details are Invalid...!");
		}
	}
}
