package Inheritance;
import java.util.*;
class Mainn
{
public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int i=1;
    Cust cc=new Cust();
    Book pp=new Book();
    System.out.println("Name of the book");
   cc.setbookname(s.next());
    System.out.println("ISBN Number");
	 cc.setisbn(s.nextInt());
    System.out.println("Publisher name");
     cc.setpubname(s.next());
    System.out.println("Price of a book :");
    int price=s.nextInt();
    System.out.println("Number of Customers");
   cc.settotalcust(s.nextInt());
    int a=cc.gettotalcust();
    do {
    System.out.printf("Details Of Customer%d\n",i);i++;
    System.out.println("Name");
    String namee=s.next();
    System.out.println("Type of Customer (S or I or F)");
   	String type=s.next();
    if(a==1)
    {
     // cc.show(namee,type);
      pp.det(cc.getbookname(), cc.getisbn(), cc.getpubname(), cc.gettotalcust(), cc.gettotalamount(), price);
    cc.total(price,type);
    }
      a--;
    }while(a>0);
  }
}
class Book
{
  String per[]=new String[25];
  String bookname;
  int isbn;
  String pubname;
  int totalcust;
  int totalamnt;
private int totalamount;
  public String getbookname() {
		return bookname;
	}
 
public void setbookname(String name)
  {
		this.bookname=name;
	}
  public int getisbn() {
		return isbn;
	}
   public void setisbn(int isbn)
  {
		this.isbn=isbn;
	}
  public String getpubname() {
		return pubname;
	}
  public void setpubname(String pubname)
  {
		this.pubname=pubname;
	}
  public int gettotalcust() {
		return totalcust;
	}
   public void settotalcust(int totalcust)
  {
		this.totalcust=totalcust;
	}
  public int gettotalamount() {
		return totalamount;
	}
   public void settotalamount(int totalamount)
  {
		this.totalamount=totalamount;
	}
   public void det(String bookname,int isbn,String pubname,int totalcust,int totalamount,int price)
   {
   		System.out.println(" BookName:"+bookname);
   		System.out.println(" ISBN Number of Book:"+isbn);
   		System.out.println(" Publisher name of book:"+pubname);
   		System.out.println(" Number of customers:"+totalcust);
   		System.out.println(" Price of a book:"+price);
   } 
  
   }
class Cust extends Book
{
public void show(String name,String type)
{
System.out.println("Book Details are");
System.out.println(name);
System.out.println(type);
}
public void total(int price,String type)
{
	int total=0;
	if(type=="s");
	 {
		 total=(price-50)/100; 
	 }
	 if(type=="f")
	 {
		total=(price-75)/100; 
	 }
	 else
	 {
		 total=(price-90)/100;
	 }
	 System.out.println("Total amount recived"+total);
	 }
}