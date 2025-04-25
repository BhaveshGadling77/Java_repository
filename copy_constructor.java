class Employee {
    int eid;
    String empname;

    Employee(int id, String name) {
        eid = id;
        empname = name;
        System.out.println(eid + "," + empname);
    }
}

public class copy_constructor {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Bhavesh");
    }
}