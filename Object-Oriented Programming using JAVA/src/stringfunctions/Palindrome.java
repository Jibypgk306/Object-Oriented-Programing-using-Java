package stringfunctions;

import java.util.*;
class Palindrome
{
  public static void main(String [] args)
  {
    Scanner s=new Scanner(System.in);
    String ss = s.next().toUpperCase();
    for(char c = 'A'; c <= 'Z'; c++)
    {
        int count = 0;
        for(int i = 0; i < ss.length(); i++)
        {
            char x = ss.charAt(i);
            if(x == c)
            count++;
        }
        if(count > 0)
            System.out.println(c + "\t" + count);
    }
}
}

