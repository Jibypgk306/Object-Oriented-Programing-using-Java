package datetime;
import java.util.Calendar;
public class calenderr {

	public static void main(String[] args)
	{
		Calendar calendar=Calendar.getInstance();
		System.out.println("At present Calender's Year:"
		+calendar.get(Calendar.YEAR));
		System.out.println("At present Calender's Day:"
				+calendar.get(Calendar.DATE));
		System.out.println("The current date is:"
				+calendar.getTime());
		calendar.add(calendar.MONTH,10);
		System.out.println("10 Months later:"
				+calendar.getTime());
		calendar.add(calendar.YEAR,10);
		System.out.println("10 Years later:"
		+calendar.getTime());;
	}

	

}
