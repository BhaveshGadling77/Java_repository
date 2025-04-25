import java.util.*;
import java.time.LocalTime;

public class AdvancedJava {

	public static void main(String[] args) {
		// Q-1
		ArrayList ar = new ArrayList();
		ar.add("Student 1");
		ar.add("Student 2");
		ar.add("Student 3");
		ar.add("Student 4");
		ar.add("Student 5");
		ar.add("Student 6");
		ar.add("Student 7");
		ar.add("Student 8");
		ar.add("Student 9");
		ar.add("Student 10");
		for (Object o : ar) {
			System.out.println(o);
		}
		// Q2
		Date d = new Date();
		System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
		// Q3
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

		// ->Q4
		LocalTime obj = LocalTime.now();
		System.out.println(obj);
	}

}