package exceptions;

public class Arii{

	public static void main(String[] args)
	{
		try
		{
			int a=100/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
	System.out.println("Arithmetic exception:"+e);
		}
		catch(Exception e)
		{
System.out.println("Array index Out of bound :"+e);
		}
		finally
		{
System.out.println("Program closed");
		}
	}
}
