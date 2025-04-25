class Base1 {
    Base1() {
        System.out.println("I am constructor....");
    }

    Base1(int x) {
        System.out.println("I am an overloading consturctor with value of a as : " + x);

    }
}

class Base2 extends Base1 {
    Base2() {
        super(2);
        // super(1,2);
        System.out.println("I am a derived class constructor");
    }

    Base2(int x, int y) {
        super(x);
        System.out.println("I am a overloading constructor " + x + "    " + y + " ");
    }
}

class derived extends Base2 {
    derived() {
        System.out.println("I am a child of derived constructor !! ");
    }

    derived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a constructor of derived class x: " + x + "y:" + y + "z:" + z);
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {

        derived obj = new derived(12, 45, 21);

    }
}