interface sample{
    void meth1();
    void meth2();
}
interface childSample extends sample{
    void meth3();
    void meth4();
}
class mySampleClass implements childSample{
    public void meth1(){
         System.out.println("meth1");
    }
public void meth2(){
    System.out.println("meth2");  
}
   public void meth3(){
    System.out.println("meth3");
 }
    public void meth4(){
        System.out.println("meth4");
    }
    }

public class Inheritance_in_interfaces {
    
    public static void main(String[] args) {
    mySampleClass obj =new mySampleClass();
System.out.println("Start excution...");        
    obj.meth1();
obj.meth2();
obj.meth3();
obj.meth4(); 
      }
}