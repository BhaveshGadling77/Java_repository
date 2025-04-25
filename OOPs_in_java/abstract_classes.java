abstract class Parent {
    public Parent() {
        System.out.println("Mai Parent1 ka constructor hu.....");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();

    abstract public void greet2();
}

class child2 extends Parent {
    public void greet() {
        System.out.println("Good morning");
    }

    public void greet2() {
        System.out.println("I am good ");
    }

}

abstract class Child3 extends Parent {
    public void th() {
        System.out.println("I am good");
    }
}

public class abstract_classes {
    public static void main(String[] args) {

        child2 obj = new child2();

    }
}