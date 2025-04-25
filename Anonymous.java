
interface DemoAny {
	void meth1();

	void meth2();
}

/*
 * class Ano implements DemoAny{
 * public void meth1(){
 * System.out.println("Hi I am meth1 ");
 * } public void meth2(){
 * System.out.println("Hi I am meth2 ");
 * }
 * }
 * 
 * class BhaFunc implements DemoAny{
 * 
 * @Override
 * public void meth1(){
 * System.out.println("This is method...");
 * 
 * }
 * public void meth2(){
 * System.out.println("This is method...");
 * 
 * }
 * 
 * }
 */
public class Anonymous {

	public static void main(String[] args) {
		// Ano obj = new Ano();
		// obj.meth1();
		// -> anonymous class
		/*
		 * DemoAny obj = new DemoAny(){
		 * public void meth1(){
		 * System.out.println("Hi I am meth1 ");
		 * }
		 * public void meth2(){
		 * System.out.println("Hi I am meth2 ");
		 * }
		 * };
		 * obj.meth1();
		 */
		// Lambda expression
		DemoAny obj = () -> {
			System.out.println("i am meth1 from lambda expression");
		};
		obj.meth1();
	}

}