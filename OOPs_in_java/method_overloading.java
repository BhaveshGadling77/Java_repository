public class method_overloading {
    public static void main(String[] args) {
	//		System.out.println("Hi");
//			System.out.println(getInt(65,65));
//		//	System.out.println(getTrue());
//System.out.println(sum(1,2));
//System.out.println(sum(1,2,3));
//		}	
//static  void println(){
//	    System.out.println("Your the best.");
//}
// static int getInt(int num1, int num2){
//     return num1+num2;
// }
// static int sum(int x, int y){
//     	return x+y;
// }
// static int sum(int y , int x, int z){
//     	return x+y+z;
// }

    }
    public static void recu(int num) {
        System.out.println(num);
        if (num > 0)
            recu(num - 1);
    }

    }