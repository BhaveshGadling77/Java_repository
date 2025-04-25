public class Test {
	int id;
	String name;
	void print(){
	    System.out.println("Method");
	}
	void Hello(){
	    System.out.println("Hello..hello....Hello....!!");
	}
	//Test(){
//	System.out.println(id + " "+name); 	    
//	}
	
	public static void main(String[] args) {
Test obj = new Test();
	obj.Hello();
	obj.print();
	}
} 
