class Animal {
    int legs = 4;
    int claws = 5;

    void eat() {
        System.out.println("Eating....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Bow.....bow....");
    }
}

class Cat extends Animal {
    void Meow() {
        System.out.println("Meow....meow......meow.....");
        System.out.println("Abe aukaat me reh..... :)(");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        System.out.println(obj.legs);
        obj.bark();
        Cat obj1 = new Cat();
        obj1.Meow();
        System.out.println(obj1.legs);
    }
}