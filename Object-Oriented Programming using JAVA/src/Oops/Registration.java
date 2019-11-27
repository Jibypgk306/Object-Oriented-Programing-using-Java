package Oops;
import java.util.Scanner;
public class Registration
{
public static void main(String[] ard) {
String[] cc=new String[30];
String pr,no;
int x=1;
int i=1;
int d;
int b;
int c;
int e;
int f;
int total=0;
int[] booke=new int[25];
 Scanner s=new Scanner(System.in);
do
{
System.out.println("Registration");
  System.out.println("Enter your name");
cc[i]=s.next();
   System.out.println("Enter your address\n");
 String  address=s.next();
   System.out.println("Contact Number");
  String contact=s.next();
System.out.println("E-Mail ID");
String   email=s.next();  
   System.out.println("Enter proof type");
 String  prooftype=s.next();  
   System.out.println("Enter proof id");
String proofid=s.next();  
System.out.println("Do u want continue registration");
no=s.next();
if(no.equals("yes")==true)
{
book();
i++;
}
System.out.println("Do u want continue registration");
no=s.next();

}while(no.equals("yes")==true);
view(i);
for(int k=1;k<i;k++)
{
System.out.print(k+"              " +cc[k]);

}
}
private static void view(int i)
{
System.out.println("View all bookings");
Scanner s=new Scanner(System.in);
System.out.println("Enter the start date");
String sd=s.next();
System.out.println("Enter the end date");
String ed=s.next();
System.out.println("the booking made from"+sd+"to"+ed);
System.out.println("room number   customer id");

for(int k=1;k<i;k++)
{
System.out.print(i-1+"              " +k);
}
}
private static void book() {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int[] booke=new int[25];
int x=1;
String pr;
int i=1;
int d;
int b;
int c;
int e;
int f;
int total=0;
do {
System.out.println("\nBooking:");
System.out.println("Please choose the service required");
System.out.println("AC/Non-AC(AC/nAC)");
String ac=s.next();
if(ac.contentEquals("AC")==true)
{
b=1500;
}
else
{
b=700;
}
System.out.println("Cot(Single/Double)");
String cot=s.next();
if(cot.contentEquals("Single")==true)
{
c=50;
}
else
{
c=100;
}
System.out.println("With cable connection/without cable connection(C/nC)");
String cable=s.next();
if(cable.contentEquals("C")==true)
{
d=50;
}
else
{
d=0;
}
System.out.println("Wi-Fi needed or not(W/nW)");
String wifi=s.next();
if(wifi.contentEquals("W")==true)
{
e=200;
}
else
{
e=0;
}
System.out.println("Laundry service needed or not(L/nL)");
String laundry=s.next();
if(laundry.contentEquals("L")==true)
{
f=100;
}
else
{
f=0;
}

total=b+c+d+e+f;
System.out.println("The total charge RS."+total);
System.out.println("The services chosen are");
System.out.println(ac);
System.out.println(cot);
System.out.println(cable);
System.out.println(wifi);
System.out.println(laundry);
System.out.println("Do you want to proceed");
pr=s.next();

if(pr.equals("yes")==true)
{
booke[x]=1;
System.out.println("Thank you your room number is"+x);
x=x+1;
}
}while(pr.equals("yes"));
}
}
