import java.util.Date;
import java.text.DateFormat;

public class DateChangeActivity {

	public static void main(String[] args) {
		Date now = new Date();
		DateFormat defaultDate = DateFormat.getDateInstance();
		String date = defaultDate.format(now);
		DateFormat defaultTime = DateFormat.getTimeInstance();
		String time = defaultTime.format(now);
		System.out.println(date);
		System.out.println(time);
	}

}