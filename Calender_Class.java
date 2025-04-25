import java.util.*;

public class Calender_Class {

	public static void main(String[] args) {
		/*
		 * Calendar c = Calendar.getInstance();
		 * System.out.println(c.getCalendarType());
		 * System.out.println(c.getTimeZone());
		 */
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/India"));
		// System.out.println(c.getCalendarType());
		// System.out.println(c.getTimeZone());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.isLeapYear(2016));

	}
}