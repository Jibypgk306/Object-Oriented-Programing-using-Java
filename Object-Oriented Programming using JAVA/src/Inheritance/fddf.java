package Inheritance;

import java.util.*;
class vehicle
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
    	    int colour=s.nextInt();
    	    System.out.println("Enter the Maximum speed");
    	    int speed=s.nextInt();
    	    System.out.println("Enter the number of Seats");
    	    int seat=s.nextInt();
    	    System.out.println("Enter the number of Wheels");
    	    int wheels=s.nextInt();
     g.displaydetails(colour,speed,seat,wheels);
        break;
      case 2:
    	  System.out.println("Enter the details of Bike");
    	  System.out.println("Enter the colour");
  	    int colour1=s.nextInt();
  	    System.out.println("Enter the Maximum speed");
  	    int speed1=s.nextInt();
  	    System.out.println("Enter the number of Seats");
  	    int seat1=s.nextInt();
  	    System.out.println("Enter the number of Wheels");
  	    int wheels1=s.nextInt();
  	    b.displaydetails(colour1,speed1,seat1,wheels1);
        break; 
  }
}
}
class Car
{
	public void displaydetails(int colour, int speed, int seat, int wheels)
	{
		System.out.println("Colour:"+colour);
		System.out.println("Speed:"+speed);
		System.out.println("Seat:"+seat);
		System.out.println("wheel:"+wheels);
	}
}
class Bike extends Car
{
	public void displaydetails(int colour1, int speed1, int seat1, int wheels1)
	{
		System.out.println("Colour:"+colour1);
		System.out.println("Speed:"+speed1);
		System.out.println("Seat:"+seat1);
		System.out.println("wheel:"+wheels1);
	}
}