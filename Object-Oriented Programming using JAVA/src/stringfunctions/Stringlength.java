package stringfunctions;
import java.util.*;
public class Stringlength {

	public static void main(String[] args)
	{
		String a=new String("hai ");
		String b=new String("good morning all my friends");
		String c=new String(" the");
		System.out.println(a.length());
		System.out.println(a.substring(1,2));
		System.out.println(a.charAt(2));
		System.out.println(b.startsWith("good"));
		System.out.println(a.indexOf("hai"));
		System.out.println(a.concat(b));
		System.out.println(b.replace("good", "jiby"));
		System.out.println(b.equals(c));
		System.out.println(b.toLowerCase());
		System.out.println(b.toUpperCase());
		String[] words=b.split(" ");
		for(int i=0;i<words.length;i++)
		{
		System.out.println(words[i]);
	}
}
}
