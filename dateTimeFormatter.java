
import java.time.*;
import java.time.format.DateTimeFormatter;

public class dateTimeFormatter {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/LL/YYYY");
		DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

		String myDate = dt.format(df);
		System.out.println(myDate);

	}

}