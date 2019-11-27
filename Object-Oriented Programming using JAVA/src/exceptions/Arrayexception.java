package exceptions;

public class Arrayexception {

	public static void main(String[] args)
	{

		try
		{
			int arr[]= {1,3,5,7};
			System.out.println(arr[10]);
		}
	catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Check Index"+e);
		}
		catch(Exception e)
		{
			System.out.println("Check Index"+e);

		}
	}

}
