package thread;

public class Thr {

	public static void main(String[] args) 
	{
Car t=new Car();
Car1 t1=new Car1();
Car3 t2=new Car3();
t.run();
t1.run();
t2.run();
	}
}
class Car extends Thread
{
public void run()
{
	for(int i=0;i<=5;i++)
	{
		if(i==1)
		System.out.println("Car A running "+i);
	}
	System.out.println("Car A running complete");
	
}
}
class Car1 extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<=5;i++)
		{
			if(i==2)
			
				System.out.println("Car B running "+i);
			
		}
		System.out.println("Car B running completted");

	}
}
class Car3 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==3)
			{
				try
				{
				System.out.println("Car running sleep");
				java.lang.Thread.sleep(10000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
}