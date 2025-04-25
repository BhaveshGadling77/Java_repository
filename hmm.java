public class hmm {

	public static void main(String[] args) {

		int[] num = { 1, 4, 9, 25, 36, 49, 64, 81, 100 };
		int i = 0;
		int x = 36;
		while (i < num.length) {
			if (num[i] == x) {
				System.out.print("Found at index : " + i);
				break;
			}
			i++;
			System.out.println("finding....");
		}
	}

}