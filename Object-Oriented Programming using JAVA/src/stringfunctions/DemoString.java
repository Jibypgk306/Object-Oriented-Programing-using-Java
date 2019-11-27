package stringfunctions;

import java.io.*;
class DemoString
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim()+" ";
        String word = "";
        String longword = "";
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == ' ')
            {
                if(longword.length()<word.length())
                    longword = word;
                word = "";
            }
            else
             word = word + c;
        }
        int l = longword.length();
        System.out.println(longword);
        System.out.println(l);
    }
}
 