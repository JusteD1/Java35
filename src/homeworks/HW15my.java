package homeworks;

import basics.Input;

import java.util.Scanner;

public class HW15my {
    public static void main(String[] args) {
        rockPaperScissors();
    }

    public static String rockPaperScissors() {

        Scanner scanner = new Scanner(System.in);
        char again = 'y';
        String finalresult = "";

        while (again == 'y') {
            System.out.println("Player 1, please enter your choice: Rock, Paper, Scissors");
            String input1 = scanner.nextLine();
            System.out.println("Player 2, please enter your choice: Rock, Paper, Scissors");
            String input2 = scanner.nextLine();

            String winner1 = "Winner: Player1";
            String winner2 = "Winner: Player2";
            String tie = "TIE- both players chose the same";

            if (input1.equalsIgnoreCase("Rock") || input1.equalsIgnoreCase("Paper") || input1.equalsIgnoreCase("Scissors")) {

            } else {
                System.out.println("Input is invalid");
            }
            if (input2.equalsIgnoreCase("Rock") || input2.equalsIgnoreCase("Paper") || input2.equalsIgnoreCase("Scissors")) {

            } else {
                System.out.println("Input is invalid");
            }


            if (input1.equalsIgnoreCase("Rock") && input2.equalsIgnoreCase("Paper")) {
                System.out.println(winner2 + ", as paper covers the rock");
            } else if (input2.equalsIgnoreCase("Rock") && input1.equalsIgnoreCase("Paper")) {
                System.out.println(winner1 + ", as paper covers the rock");
            }

            if (input1.equalsIgnoreCase("Paper") && input2.equalsIgnoreCase("Scissors")) {
                System.out.println(winner2 + ", as scissors cuts the paper");
            } else if (input2.equalsIgnoreCase("Paper") && input1.equalsIgnoreCase("Scissors")) {
                System.out.println(winner1 + ", as scissors cuts the paper");
            }

            if (input1.equalsIgnoreCase("Scissors") && input2.equalsIgnoreCase("Rock")) {
                System.out.println(winner2 + ", as rock crushes the scissors");
            } else if (input2.equalsIgnoreCase("Scissors") && input1.equalsIgnoreCase("Rock")) {
                System.out.println(winner1 + ", as rock crushes the scissors");
            }

            if (input1.equalsIgnoreCase(input2) && input2.equalsIgnoreCase(input1)) {
                System.out.println(tie);
            }

            System.out.println("Do you want to play again? y/n");
            again = scanner.next().charAt(0);
            scanner.nextLine();

        }
        return finalresult;
    }
}




