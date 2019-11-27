package exceptions;

public class Exceptionn {

	public static void main(String[] args) 
	{
		try
		{
		int a=50/0;
		String s=null;
		System.out.println(s.length());
		String ss="abc";
		int i=Integer.parseInt(ss);
		int aa[]=new int[5];
		aa[10]=50;
	}
		catch(ArithmeticException e)
		{
	System.out.println("Arithmetic exception:"+e);
		}
}
}
