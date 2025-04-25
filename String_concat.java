import java.util.Scanner;

class employee {
    int id;
    String name;
    int salary;

    public void printDetails() {

        System.out.println(" ");
        System.out.println("My ID is " + id);
        System.out.println(" ");
        System.out.println("My name is " + name);
        System.out.println(" ");

        System.out.println("My salary is " + salary + "k");
        System.out.println(" ");
    }

}

public class String_concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is our custom class ");
        employee harry = new employee();

        System.out.print("Enter your ID = ");
        harry.id = sc.nextInt();
        System.out.print("Enter Your name Employee = ");
        harry.name = sc.next();
        System.out.print("Enter you are salary (in thousands) = ");
        harry.salary = sc.nextInt();
        harry.printDetails();

    }
}