

import java.time.LocalDate;
import java.time.*;
import java.util.*;

public class APl {

	public static void main(String[] args) {
		LocalDate a = LocalDate.now();
		System.out.println(a);
		LocalTime t = LocalTime.now();
		System.out.println(t);

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
	}
}