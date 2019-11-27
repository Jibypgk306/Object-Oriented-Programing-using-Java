package stringfunctions;
import java.util.*;
public class Countstringvals {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		int vow=0;
		int num=0;
		int special=0;
		int upper=0;
		int lower=0;
		int len=a.length();
		for(int i=0;i<len;i++)
		{
		char ch=a.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||
				ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			vow++;
		}
		else if(ch>'0' && ch<'9')
		{
			num++;
		}
		else if(ch=='@'||ch=='*'||ch=='#'||ch=='&'||ch=='_')
		{
			special++;
		}
		else if(ch>'A' && ch<'Z')
		{
			upper++;
		}
		else if(ch>'a' && ch<'z')
		{
			lower++;
		}
		}
		System.out.println("Vowels:"+vow);
		System.out.println("Integer:"+num);
		System.out.println("specialchars:"+special);
		System.out.println("uppercase:"+upper);
		System.out.println("Lowercase:"+lower);
}
}