import java.util.*;

public class loops_practice_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int size = sc.nextInt();
        // for(int row=0; row< size ;row++){
        // for(int col = 0; col<size-row; col++)
        // System.out.print(" * ");
        //
        // System.out.println();
        // }
        // question 2
        // int num = 0;
        // int sum = 0;
        // while(num<=size){
        //
        // num++;
        // if(num%2 ==0)
        // sum = sum+num;
        // }
        // System.out.println("The sum of first " + size +" even numbers is : "+sum);

        // Question 3
        // int mul = 0;
        // System.out.print("Enter the number : ");
        // int table = sc.nextInt();
        // for(int count = 1; count< 11; count++){
        // mul = mul+ table*count;
        // System.out.printf("%d X %d = %d\n", table, count, table*count);
        // }
        // Question 4
        // System.out.print("Enter the number : ");
        // int table = sc.nextInt();
        // for(int count = 10; count>0; count--){
        // //mul = mul+ table*count;
        // System.out.printf("%d X %d = %d\n", table, count, table*count);
        // }
        // Question 4
        // int size = sc.nextInt();
        // int fact = 1;
        // int mul = 0;
        // for(int i = size; i >0; i--){
        // fact *=i;
        // }
        // System.out.println(size+"! = "+fact);
        // -> Question 6
        // int size = sc.nextInt();
        // int fact = 1;
        // int i = size;
        // while(i>0){
        // fact *= i;
        // i--;
        // }
        // System.out.println(size + "! = "+ fact);

        // ->Question 7
        // int size = sc.nextInt();
        // int row = 0;
        // int col = 0;
        // while(row<=size){
        // row++;
        // int col = 0;
        // while(col<=size -row){
        //
        // col++;
        // System.out.print(" * ");
        // }
        //
        // System.out.println();
        // }
        // -> Question 9
        // int mul =0;
        // System.out.print("Enter the number : ");
        // int table = sc.nextInt();
        // for(int count = 1; count< 11; count++){
        // mul = mul+ table*count;
        // System.out.printf("%d X %d = %d\n", table, count, table*count);
        //
        // }
        // System.out.println("the sum of numbers in table of "+table+ " = "+mul);
        // -> Question 11
        int fact = 1;
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            fact *= i;
        }
        System.out.println(size + "! = " + fact);

    }
}