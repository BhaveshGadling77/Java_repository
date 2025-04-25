
import java.util.*;

public class Date_class {

	public static void main(String[] args) {
		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(System.currentTimeMillis());
		Date d = new Date();
		System.out.println(d);
		// System.out.println(d.getYear());
		// System.out.println(d.getClass());
		System.out.println("Hours : " + d.getHours());
		System.out.println("Month : " + d.getMonth());
		System.out.println("Day : " + d.getDay());

	}

}