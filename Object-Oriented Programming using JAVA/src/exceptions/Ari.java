package exceptions;

public class Ari{

	public static void main(String[] args)
	{
		try
		{
			int arr[]= {1,3,5,7};
			System.out.println(arr[10]);
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
