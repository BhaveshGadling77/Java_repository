class Car {
    String name;
    String brand;
    String name1;
    String brand1;

    void show() {
        System.out.println("Car name : " + name);
        System.out.println("brand : " + brand);
    }
}

public class Classes {
    public static void main(String[] args) {
        Car set = new Car();
        set.name = "Fortuner";
        set.brand = "Toyota";
        set.name1 = "Thar";
        set.brand1 = "Mahendra";
        set.show();
    }
}