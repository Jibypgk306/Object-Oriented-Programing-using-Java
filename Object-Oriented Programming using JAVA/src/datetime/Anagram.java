package datetime;
import java.util.*;
public class Anagram {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string1");
		String str1=s.next();
		System.out.println("Enter the string2");
		String str2=s.next();
		int l1=str1.length();
		int l2=str2.length();
		char w1[]=str1.toCharArray();
		Arrays.sort(w1);
		char w2[]=str2.toCharArray();
		Arrays.sort(w2);
		if(w1.equals(w2))
		{
			System.out.println("Anagram");
	}
		else
		{
			System.out.println("Not Anagram");
	
		}

}
}
