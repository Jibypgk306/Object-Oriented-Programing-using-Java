package Case;
import java.util.Scanner;
public class Case3 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
Booking3 b=new Booking3();
b.book();
}
}
class Booking3 {
static int booked[]=new int[25];
static void book() {
Scanner s=new Scanner(System.in);
     System.out.println("Registration");
   System.out.println("Enter your name");
 String name=s.nextLine();
    System.out.println("Enter your address");
  String  address=s.nextLine();
    System.out.println("Contact Number");
String  contact=s.nextLine();
 System.out.println("E-Mail ID");
 String   email=s.nextLine();  
    System.out.println("Enter proof type");
  String  prooftype=s.nextLine();  
    System.out.println("Enter proof id");
String proofid=s.nextLine();  
  Customer cust=new Customer(name,address,contact,email,prooftype,proofid);
   cust.reg(name,address,contact,email,prooftype,proofid);
 }
}
class Customer
{ 
Scanner s=new Scanner(System.in);
String pr="";String email1;
static int booked[]=new int[25];
    String name;
       String address;
       String contact;
  String email;
  String prooftype;
String proofid;
 Customer(String name,String address,String contact,String email,String prooftype,String proofid)
 {
   this.name=name;
     this.address=address;
     this.contact=contact;
     this.email=email;
   this.prooftype=prooftype;
    this.proofid= proofid;
 }
 void reg(String name,String address,String contact,String email,String prooftype, String proofid )
 {
   System.out.println("Customer Details");
   System.out.println(name);
   System.out.println(address);
   System.out.println(contact);
   System.out.println(email);
   System.out.println(prooftype);
   System.out.println(proofid);
   System.out.println("Thank you for registering. Your id is 1...");
   System.out.println("Do you want to continue registration?(y/n)");
   pr = s.next();
if (pr.equals("n")==true || pr.equals("y")==true)
{
   System.out.println("Do you want to update the email id?(yes/no)");
   String ye=s.next();
   if(ye.equals("y")==true) {
   System.out.println("Update Email");
   System.out.println("Enter new Email id:");
   email1=s.next();
   email=email1;
   System.out.println("Email updated");
}
   System.out.println("Your details are as follows");
   System.out.println(name);
   System.out.println(address);
   System.out.println(contact);
   System.out.println(email);
   System.out.println(prooftype);
   System.out.println(proofid);
}
 }
}