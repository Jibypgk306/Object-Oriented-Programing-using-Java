package thread;
import java.util.*;

class A extends Thread
{
	public void run()
	{
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("thradd");

	}
}
public class Thread {

	public static void main(String[] args) {
A a=new A();
a.start();
	}

	public static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
