import java.util.Scanner;

public class fibu_series {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;

    static void fibPrint(int count){
 if(count > 0){
        
        n3 = n1+n2;       
        n1 = n2;
        n2 = n3;
    System.out.print("," + n3);

fibprint(count - 1);
}
}

    public static void main(String[] args) {
        System.out.println("Fibunacci series");
        Scanner sc = new Scanner(System.in);
        int count = 10;
        System.out.print(n1 + "," + n2);

        fibprint(count);

    }

}
