package regx;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regularexpresion {

	public static void main(String[] args) 
	{

		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile("....@.....");
		Matcher m=p.matcher("jiby@gmail");
		boolean b=m.matches();
		System.out.println(b);
	}

}
