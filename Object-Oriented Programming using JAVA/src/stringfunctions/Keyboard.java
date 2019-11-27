package stringfunctions;
import java.util.Scanner;
public class Keyboard {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s="qwertyuiou asdfghjkl;zdsqwdddd";
int i,j;
System.out.println("Enter a character");
char c=sc.next().charAt(0);
System.out.print("Enter the string");
String st=sc.next();
System.out.println("\nThe original message is");
int stl=st.length();
int sl=s.length();
for(i=0;i<stl;i++)
{
for(j=0;j<sl;j++)
{
if(st.charAt(i)==s.charAt(j) && c=='R')
{
System.out.printf("%c",s.charAt(j-1));
}
if(st.charAt(i)==s.charAt(j) && c=='L')
{
System.out.printf("%c",s.charAt(j-1));
}
}
}
}
}
