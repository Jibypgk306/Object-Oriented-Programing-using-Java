import java.util.Scanner;
public class Countpali {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String r="";
		String n=s.next();
		String t=n;
		int length=n.length();
		int count=0;
		for(int i=length-1;i>=0;i--)
		{
			r=r+n.charAt(i);
		}
		if(t.equals(r))
		{
			count++;
		}
		
	}
}