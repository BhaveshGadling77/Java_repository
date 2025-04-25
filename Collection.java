import java.util.*;

public class Collection {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(3);
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				int el = list1.get(j);
				if (list.get(i) == list.get(j)) {
					list1.add(i);
				}
			}
		}
		System.out.println("The list is : " + list);
		System.out.println("The duplicate elements : " + list1);

	}

}