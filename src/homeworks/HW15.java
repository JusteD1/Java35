package homeworks;

import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        //Scanner and call the method

        Scanner scanner = new Scanner(System.in);
        System.out.println("Player1, please enter your choice: rock, paper, scissors");
        String player1 = scanner.nextLine();
        System.out.println("Player2, please enter your choice: rock, paper, scissors");
        String player2 = scanner.nextLine();


        //Method should be called Rock Paper Scissors

    //public static String rockPaperScissors(String player1, String player2) {



        if(player1.equalsIgnoreCase("Rock")&& (player2.equalsIgnoreCase("Paper"))) {
            System.out.println("Winner is player2 (as paper covers rock)");
        } else if (player1.equalsIgnoreCase("Paper")&& (player2.equalsIgnoreCase("Scissors"))) {
            System.out.println("Winner is player2 (as scissors cuts paper)");
        } else if (player1.equalsIgnoreCase("Scissors")&& (player2.equalsIgnoreCase("Rock"))) {
            System.out.println("Winner is player2 (as rock smashes scissors)");
        } else if (player1.equalsIgnoreCase("Rock") == player2.equalsIgnoreCase("Rock")) {
            System.out.println("TIE (as both inputs are the same");
        }

    }
}

