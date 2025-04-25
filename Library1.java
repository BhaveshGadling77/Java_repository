class Library2 {
	String[] books;
	int nobooks;

	Library2() {
		this.books = new String[100];
		this.nobooks = 0;
	}

	void add(String book) {
		this.books[nobooks] = book;
		nobooks++;
		System.out.println(book + " has been added!");
	}

	void showbooks() {
		System.out.println("Available books are : ");
		for (String list : this.books) {
			if (list == null)
				break;
			System.out.println("* " + list);
		}
	}

	void issue(String book) {
		for (int i = 0; i < this.books.length; i++) {
			if (this.books[i].equals(book)) {
				System.out.println("the book has been issued!");
				this.books[i] = null;
				continue;
			}
		}
		System.out.println("This book does not exist...");

	}

	void returnbook(String book) {
		this.books[nobooks] = book;
	}
}

public class Library1 {

	public static void main(String[] args) {
		Library2 obj = new Library2();
		obj.add("Think and grow rich");
		obj.showbooks();
		obj.add("algorithms");
		obj.add("C++");
	}

}