class Animal {
    int legs = 4;

    void eat() {
        System.out.println("Eating......!!!!");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Bow.....bow......bow......!!");
    }
}

class Puppy extends Dog {
    void cute() {
        System.out.println("How cute you are....!!!");
    }
}

public class Multi_level_inheritance {
    public static void main(String[] args) {
        // Animal obj = new Animal();
        // Dog obj1 = new Dog();
        Puppy obj2 = new Puppy();
        obj2.cute();
        System.out.println(obj2.legs);
        obj2.bark();
        obj2.eat();
    }
}