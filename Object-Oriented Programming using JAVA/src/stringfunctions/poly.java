package stringfunctions;

import java.util.*;
class poly
{
  public static void main(String args[])
  {
	  Scanner s=new Scanner(System.in);
	   StringBuffer sc=new StringBuffer();
	   System.out.println("1.Car");
        System.out.println("2.Bike");
    System.out.println("Enter ur choice");
    int n=s.nextInt();
    Car g=new Car();
    Bike b=new Bike();
    switch(n)
    {
      case 1:
    	  System.out.println("Enter the details of car");
    	    System.out.println("Enter the colour");
    	    sc.append(s.next()+"\n");
    	    System.out.println("Enter the Maximum speed");
    	    sc.append(s.next()+"\n");
    	    System.out.println("Enter the number of Seats");
    	    sc.append(s.next()+"\n");
    	    System.out.println("Enter the number of Wheels");
    	    sc.append(s.next()+"\n");
    	    System.out.println("Enter the status of break(True/False)");
    	    sc.append(s.next()+"\n");
    	    g.displaydetails(sc.append(s.next(),sc.append(s.next(),sc.append(s.next(),sc.append(s.next(),sc.append(s.next());
        break;
      case 2:
    	  System.out.println("Enter the details of Bike");
    	  System.out.println("Enter the colour");
  	    sc.append(s.next()+"\n");
  	    System.out.println("Enter the Maximum speed");
	    sc.append(s.next()+"\n");
  	    System.out.println("Enter the number of Seats");
	    sc.append(s.next()+"\n");
  	    System.out.println("Enter the number of Wheels");
	    sc.append(s.next()+"\n");
  	  System.out.println("Enter the Break(True/False)");
	    sc.append(s.next()+"\n");
  	    b.displaydetails(sc.append(s.next()),sc.append(s.next()),sc.append(s.next()),sc.append(s.next()),sc.append(s.next()));
        break; 
  }
}
}
class Car
{
	public void displaydetails(String colour, int speed, int seat, int wheels,String breakk)
	{
		System.out.println("Colour:"+colour);
		System.out.println("Speed:"+speed);
		System.out.println("Seat:"+seat);
		System.out.println("wheel:"+wheels);
		System.out.println("Status of Break:"+breakk);

	}
}
class Bike extends Car
{
	public void displaydetails(int colour1, int speed1, int seat1, int wheels1,String breakk1)
	{
		System.out.println("Colour:"+colour1);
		System.out.println("Speed:"+speed1);
		System.out.println("Seat:"+seat1);
		System.out.println("wheel:"+wheels1);
		System.out.println("Status of Break:"+breakk1);

	}
}