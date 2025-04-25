import java.util.*;

class Employee {
    private int ph = 0;
    private int empid = 2;
    private int basicsal = 20000;
    private int incencitive = 200;

    private void countsalary() {
        System.out.println(basicsal);
    }
}

public class interfaces {
    public static void main(String[] args) {
        Employee eng = new Employee();
        //System.out.println(Employee.empid); it is not visible

    }
}