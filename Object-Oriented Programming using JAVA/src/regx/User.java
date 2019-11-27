package regx;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class User {

	public static void main(String[] args)
	{
Scanner s=new Scanner(System.in);
String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
Pattern paswordpattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
Pattern emailpattern = Pattern.compile(regex);
String email=s.next();
Matcher em=	emailpattern.matcher(email);
String password=s.next();
Matcher mtch=paswordpattern.matcher(password);
if(em.matches()) //result set for matcher class
{
	System.out.println("Valid Email ID");
}
else
{
	System.out.println("InValid Email ID");
}
if(mtch.matches())
{
	System.out.println("Valid Password");
}
else
{
	System.out.println("InValid Password");
}
	}
}
