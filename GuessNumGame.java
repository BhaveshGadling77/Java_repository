import java.util.*;

public class GuessNumGame {
    static Random rc = new Random();
    static int gnum = rc.nextInt(100) + 1;
    static int count = 0;

    public static void userInput(int inp) {
        if (gnum > inp) {
            System.out.println("Entered num is less than guessed number !!");
            getNum();
            input();
        } else if (gnum < inp) {
            System.out.println("Entered number is greater than guessed number !! ");
            getNum();
            input();
        } else {
            System.out.println("You sucessfully guessed the number....");

            System.out.println("Your score : " + getNum());
            return;
        }
    }

    public static int getNum() {
        count += 1;
        setNum();
        return count;
    }

    public static int setNum() {
        return count;
    }

    static int input() {
        System.out.print("Guess the number :");
        int c = sc.nextInt();
        userInput(c);
        return c;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This is the game of guessing the number 🎯");
        System.out.println("Now computer choosed a number !! ");
        System.out.println("Let's get start the game ");
        System.out.print("Guess the number 🤔 : ");
        int inp = sc.nextInt();
        userInput(inp);
    }
}