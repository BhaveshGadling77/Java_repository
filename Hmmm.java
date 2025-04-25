
import java.util.*;

public class Hmmm {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(7);
		l1.add(3);
		l1.add(2);
		l1.add(9);
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		ArrayDeque<Integer> ad1 = new ArrayDeque<>();
		ad1.add(6);
		ad1.add(56);
		ad1.add(4);
		ad1.addFirst(2);
		ad1.addLast(100);
		System.out.println(ad1);
		System.out.println(ad1.getFirst());
		System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
		System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
	}

}