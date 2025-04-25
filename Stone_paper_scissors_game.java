import java.util.*;

public class Stone_paper_scissors_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int you = 0;
        int comp = 0;
        System.out.println("Enter 0 for rock , Enter 1 for paper , Enter 2 for Scissors  ");
        for (int i = 1; i < 4; i++) {
            System.out.println();
            System.out.println("--> Match " + (i));
            System.out.print("Your move : ");
            int umove = sc.nextInt();
            if (umove > 3) {
                System.out.println("Please Enter the valid input !!!");
                break;
            }

            Random rc = new Random();
            int cmove = rc.nextInt(3) + 1;
            System.out.print("Computers move : ");
            if (cmove == 0)
                System.out.println("Rock");
            else if (cmove == 1)
                System.out.println("Paper");
            else
                System.out.println("Scissors");

            if (umove == cmove)
                System.out.println("There is tie !!");

            else if ((umove == 0 && cmove == 2) || (umove == 1 && cmove == 0) || (umove == 2 && cmove == 1)) {
                you++;
                System.out.println("You won!! and computer lose");
            } else {
                System.out.println("You lose and computer wins !!");
                comp++;
            }
        }
        System.out.println();

        System.out.println("Scores ->");
        System.out.println("you  comp");
        System.out.println(you + "    " + comp);
        if (you > comp)
            System.out.println("You won the game !! ");

        else if (you < comp)
            System.out.println("You lose the game !! ");

        else
            System.out.println("There is tie...");

    }
}