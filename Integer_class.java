import java.util.ArrayList;

public class Integer_class {
	public static void main(String[] args) {
		int[] array = new int[10];
		ArrayList<Integer> list = new ArrayList<Integer>();
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		list.add(1);
		list.add(2);
		list.add(3);

		System.out.println("List val = " + list.get(1));
		array[0] = 10;
		for (int e : array)
			System.out.print(e + ",");
		System.out.println(list);

		// list.remove(2);
		// System.out.println(list);
		list.set(1, 4);
		System.out.println(list);

	}
}