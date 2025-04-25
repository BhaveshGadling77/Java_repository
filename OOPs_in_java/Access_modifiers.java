import java.util.*;

class ABC {
    private ABC() {
        System.out.println("ABC constructor is calling.....!!");
    }

    ABC obj = new ABC();
}

public class Access_modifiers {
    private Main(){
        System.out.println("private const is working......!!! ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ABC obj = new ABC();// it has private access
        Main obj = new Main();

    }
}