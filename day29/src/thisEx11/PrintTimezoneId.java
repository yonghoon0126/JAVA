package thisEx11;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimezoneId {

	public static void main(String[] args) {
		
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
		
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angles");
		Calendar now = Calendar.getInstance(timeZone);
		
		System.out.println(now.get(Calendar.YEAR) + "년도" 
		+ (now.get(Calendar.MONTH) + 1) + "월" + 
				now.get(Calendar.DAY_OF_MONTH) + "일");
		
		System.out.println(now.get(Calendar.HOUR) + "시" + now.get(Calendar.MINUTE) + "분");
	}

}
