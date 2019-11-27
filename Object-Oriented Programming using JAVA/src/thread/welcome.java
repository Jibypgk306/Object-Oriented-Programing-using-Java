package thread;

public class welcome {

	public static void main(String[] args) 
	{
		aa t=new aa();
		bb t1=new bb();
		ee t2=new ee();
		ff t3=new ff();
		gg t4=new gg();
		hh t5=new hh();
		ii t6=new ii();
		cc t7=new cc();
		t.run();
		t1.run();
		t2.run();
		t3.run();
		t4.run();
		t5.run();
		t6.run();
		t7.run();
	}

}
class aa extends Thread
{
	public void run()
	{
		for(int i=0;i<=8;i++)
		{
			if(i==1)
				try
			{
			System.out.println("welcome running sleep");
			java.lang.Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
		}
		System.out.println("W");
	}
	}
class bb extends Thread
{
	public void run()
	{
		for(int i=0;i<=8;i++)
		{
			if(i==2)
				try
			{
			System.out.println("welcome running sleep");
			java.lang.Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}	
		System.out.println("E");
	}
	}
class ee extends Thread
{
	public void run()
	{
		for(int i=0;i<=8;i++)
		{
			if(i==3)
				try
			{
			System.out.println("welcome running sleep");
			java.lang.Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}	
		System.out.println("L");
	}
	}
class ff extends Thread
{
	public void run()
	{
		for(int i=0;i<=8;i++)
		{
			if(i==4)
				try
			{
			System.out.println("welcome running sleep");
			java.lang.Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}	
		System.out.println("C");
	}
	}
class gg extends Thread
{
	public void run()
	{
		for(int i=0;i<=8;i++)
		{
			if(i==5)
				try
			{
			System.out.println("welcome running sleep");
			java.lang.Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		System.out.println("O");
	}
	}
class hh extends Thread
{
	public void run()
	{
		for(int i=0;i<=8;i++)
		{
			if(i==6)
				try
			{
			System.out.println("welcome running sleep");
			java.lang.Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}	
		System.out.println("M");
	}
	}
class ii extends Thread
{
	public void run()
	{
		for(int i=0;i<=8;i++)
		{
			if(i==7)
				try
			{
			System.out.println("welcome running sleep");
			java.lang.Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}	
		System.out.println("E");
	}
	}
class cc extends Thread
{
	public void run()
	{
		for(int i=0;i<=8;i++)
		{
			if(i==8)
			{
				try
				{
				System.out.println("welcome running sleep");
				java.lang.Thread.sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	}
}