import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Get Current Day 
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		
		System.out.print("The day today is : "+new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime()));
		System.out.print(" and the current time is : ");
		System.out.println(java.time.LocalTime.now());
	}

}
