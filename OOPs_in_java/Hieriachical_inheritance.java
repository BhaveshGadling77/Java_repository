class Animal {
    int legs = 4;

}

class Dog extends Animal {
    void sound() {
        System.out.println("Bow ....Bow....!!!");
    }
}

class Cat extends Animal {
    void sound1() {
        System.out.println("Meow ......meow....!!");
    }
}

public class Hieriachical_inheritance {
    public static void main(String[] args) {
        Animal obj = new Animal();
        Cat obj1 = new Cat();
        Dog obj2 = new Dog();
        System.out.println("Dog child class.....!!");
        // System.out.println(obj2.legs);
        obj2.sound();
        // obj2.sound();
        System.out.println("Cat child class.......");
        obj1.sound1();
        System.out.println(obj1.legs);

    }
}