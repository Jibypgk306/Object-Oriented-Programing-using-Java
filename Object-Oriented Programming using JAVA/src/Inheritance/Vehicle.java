package Inheritance;

import java.util.*;
class Vehicle
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
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
    	    String colour=s.next();
    	    System.out.println("Enter the Maximum speed");
    	    int speed=s.nextInt();
    	    System.out.println("Enter the number of Seats");
    	    int seat=s.nextInt();
    	    System.out.println("Enter the number of Wheels");
    	    int wheels=s.nextInt();
    	    System.out.println("Enter the status of break(True/False)");
    	    String breakk=s.next();
     g.displaydetails(colour,speed,seat,wheels,breakk);
        break;
      case 2:
    	  System.out.println("Enter the details of Bike");
    	  System.out.println("Enter the colour");
  	    String colour1=s.next();
  	    System.out.println("Enter the Maximum speed");
  	    int speed1=s.nextInt();
  	    System.out.println("Enter the number of Seats");
  	    int seat1=s.nextInt();
  	    System.out.println("Enter the number of Wheels");
  	    int wheels1=s.nextInt();
  	  System.out.println("Enter the Break(True/False)");
	    String breakk1=s.next();
  	    b.displaydetails(colour1,speed1,seat1,wheels1,breakk1);
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