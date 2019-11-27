package exceptions;

public class exc {

	public static void main(String[] args)
	{
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
	System.out.println("Arithmetic exception:"+e);
		}
		catch(Exception e)
		{
System.out.println("Null :"+e);
		}
		finally
		{
System.out.println("Program closed");
		}
	}
}
