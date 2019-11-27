package stringfunctions;

import java.util.*;
class Vehiclecase2
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   StringBuffer sc=new StringBuffer();
        System.out.println("1.Car");
        System.out.println("2.Bike");
    System.out.println("Enter ur choice");
    int n=s.nextInt();
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
    	    System.out.println(sc);

        break;
      case 2:
    	  System.out.println("Enter the details of Bike");
    	  System.out.println("Enter the colour");
    	  sc.append(s.next()+"\n");;
  	    System.out.println("Enter the Maximum speed");
  	  sc.append(s.next()+"\n");
  	    System.out.println("Enter the number of Seats");
  	  sc.append(s.next()+"\n");
  	    System.out.println("Enter the number of Wheels");
  	  sc.append(s.next()+"\n");
  	  System.out.println("Enter the Break(True/False)");
  	sc.append(s.next()+"\n");
System.out.println(sc);
        break; 
  }
}
}
