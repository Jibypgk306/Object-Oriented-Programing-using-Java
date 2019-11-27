package car;

import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number1:");
		int a=s.nextInt();
		System.out.println("Enter the number2:");
		int b=s.nextInt();
		System.out.printf("1)ADD\n2)SUB3)MUL)\n4)div");
		int n=s.nextInt();
		Oper op=new Oper();
		switch(n)
		{
		case 1:
			Oper.add(a,b);
			break;
		case 2:
			Oper.mul(a,b);
			break;
		case 3:
			Oper.div(a,b);
			break;
		case 4:
			Oper.mod(a,b);
			break;
		case 5:
			Oper.sub(a,b);
			break;
		}
	}	
}
class Oper
{
	int a,b;
	public static void add(int a,int b) {
		// TODO Auto-generated method stub
		System.out.println("ADDITION");
		//c=a+b;
		System.out.printf("%d",a+b);
	}
	public static void mul(int a,int b) {
		System.out.println("MULTIPLICATION");
		System.out.printf("%d",a*b);
	}
	public static void div(int a,int b) {
		System.out.println("DIVISION");
		System.out.printf("%d",a/b);
	}
	public static void mod(int a,int b) {
		System.out.println("MOD");
		System.out.printf("%d",a%b);
	}
	public static void sub(int a,int b) {
		System.out.println("SUBSTRACTION");
		System.out.printf("%d",a-b);
	}
}