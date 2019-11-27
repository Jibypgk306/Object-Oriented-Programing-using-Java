package thread;
class C extends Thread{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
		System.out.println("Thread going to sleep"
				+i+"time");
		Thread.sleep(1000);
System.out.println("Thread Running"+i+"time");
System.out.println(i);
		
	}
	}
}
public class Sleepp {

	public static void main(String[] args) {

		C t=new C();
		t.run();
	}

}
