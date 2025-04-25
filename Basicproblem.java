import java.util.*;

class arrayList {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> list = new ArrayList<String>();

	void add() {
		System.out.print("What you want to add : ");
		String a = sc.nextLine();

		try {
			list.add(a);
			Thread.sleep(1000);
			System.out.println("The String is successfully added...");
		} catch (Exception e) {

		}

	}

	void remove() {
		System.out.print("Enter the String that you want to remove : ");
		String a = sc.nextLine();
		list.remove(a);
		System.out.println("THe String is successfully removed...");
	}

	void getIndex() {
		System.out.println("Enter the index of Arratlist : ");
		try {
			int indx = sc.nextInt();
			String g = list.get(indx);
			System.out.println(g);
		} catch (Exception e) {
			System.out.println("Bhai aukaat me reh....");
		}
	}

	void getSize() {
		System.out.println("Size of ArrayList is : " + list.size());
	}
}

public class Basicproblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arrayList obj = new arrayList();
		System.out.println("Methods (add,remove, getSize,getIndex,Finish) ");
		while (true) {
			System.out.println("What you want to do : ");
			String com = sc.nextLine();
			com = com.trim().toLowerCase();
			switch (com) {
				case "getsize":
					obj.getSize();
					break;

				case "add":
					obj.add();
					break;

				case "finish":
					for (int i = 0; i < 6; i++) {
						try {
							Thread.sleep(1000);
							System.out.print("•");
						} catch (Exception e) {

						}
					}
					System.out.println();
					System.out.println("[Program finished]");
					return;

				case "remove":
					obj.remove();
					break;

				case "getindex":
					obj.getIndex();
					break;

				default:
					System.out.println("Enter valid method....");
			}

		}

	}

}