package stringfunctions;

import java.util.Scanner;

public class flam {

	public static void main(String[] args) {
		String name1,name2;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the first name:");
		name1 = sc.nextLine();
		System.out.printf("Enter the second name:");
		name2 = sc.nextLine();
		System.out.printf(name1.toUpperCase()+" and "+name2.toUpperCase());
		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();
		String n1[] = name1.split(" ");
		String n2[] = name2.split(" ");
		name1="";
		name2="";
		int j=0;
		int count=6;
		int deleted_letters=0;
		for(int i=0;i<n1.length;i++)
		{
		name1 = name1+n1[i];
		}
		for(int i=0;i<n1.length;i++)
		{
		name2 = name2+n1[i];
		}
		int length = name1.length()+name2.length();
		boolean name_check[]=new boolean[10];
		for(int i=0;i<name1.length();i++)
		{
		for( j=0;j<name2.length();j++)
		{
		if(name1.charAt(i) == name2.charAt(j))
		{
		name_check[j]=true;
		break;
		}
		}
		boolean flames_check[] = new boolean[6];
		for(i=0;i<6;i++)
		{
		flames_check[i] = true;
		}
		if( j == count)
		{
		 j=0;
		}
		deleted_letters = deleted_letters+1;
	}
		if(j==0)
		{
		System.out.println(" are good FRIENDS");
		}
		else if(j==1)
		{
		System.out.println(" are LOVERS");
		}
		else if(j==2)
		{
		System.out.println(" have alot of AFFECTION");
		}
		else if(j==3)
		{
		System.out.println(" are MARRIED");
		}
		else if(j==4)
		{
		System.out.println(" are ENEMIES");
		}
		else if(j==5)
		{
		System.out.println(" are SIBLINGS");
		}
		}
	}
