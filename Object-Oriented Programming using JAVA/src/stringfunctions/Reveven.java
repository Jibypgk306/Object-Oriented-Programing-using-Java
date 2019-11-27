package stringfunctions;
import java.util.*;
public class Reveven {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String b=s.nextLine();
		int i,j;
		String[]wordss=b.split(" ");
		for(i=0;i<wordss.length;i++)//split in to words
		{
		if(i%2!=0)//check even or not
		{
			for( j=wordss.length-1;j>0;j--)//to reverse
			{
			System.out.print(wordss[i].charAt(j));//reversed word	
			}
			System.out.print(" ");
		}
		else
	{
		System.out.print(wordss[i]+" ");

	}
}
	}
	}