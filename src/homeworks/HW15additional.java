package homeworks;

import java.util.Scanner;

public class HW15additional {
    public static void main(String[] args) {
        TheBigBangTheory();

    }

    public static String TheBigBangTheory() {

        Scanner scanner = new Scanner(System.in);
        char again = 'y';
        String finalresult = "";

        while (again == 'y') {
            System.out.println("Player 1, please enter your choice: Rock, Paper, Scissors, Lizard, Spock");
            String input1 = scanner.nextLine();
            System.out.println("Player 2, please enter your choice: Rock, Paper, Scissors, Lizard, Spock");
            String input2 = scanner.nextLine();

            String winner1 = "Winner: Player1";
            String winner2 = "Winner: Player2";
            String tie = "TIE- both players choose the same";


            if (input1.equalsIgnoreCase("Rock") || input1.equalsIgnoreCase("Paper") || input1.equalsIgnoreCase("Scissors") || input1.equalsIgnoreCase("Lizard") || input1.equalsIgnoreCase("Spock")) {

            } else {
                System.out.println("Input is invalid");
            }
            if (input2.equalsIgnoreCase("Rock") || input2.equalsIgnoreCase("Paper") || input2.equalsIgnoreCase("Scissors") || input2.equalsIgnoreCase("Lizard") || input2.equalsIgnoreCase("Spock")) {

            } else {
                System.out.println("Input is invalid");
            }


            if (input1.equalsIgnoreCase("Rock") && input2.equalsIgnoreCase("Scissors")) {
                System.out.println(winner1 + ", as rock crushes scissors");
            } else if (input2.equalsIgnoreCase("Rock") && input1.equalsIgnoreCase("Scissors")) {
                System.out.println(winner2 + ", as rock crushes scissors");
            }
            if (input1.equalsIgnoreCase("Rock") && input2.equalsIgnoreCase("Lizard")) {
                System.out.println(winner1 + ", as rock smashes lizard");
            } else if (input2.equalsIgnoreCase("Rock") && input1.equalsIgnoreCase("Lizard")) {
                System.out.println(winner2 + ", as rock smashes lizard");
            }


            if (input1.equalsIgnoreCase("Paper") && input2.equalsIgnoreCase("Rock")) {
                System.out.println(winner1 + ", as paper covers rock");
            } else if (input2.equalsIgnoreCase("Paper") && input1.equalsIgnoreCase("Rock")) {
                System.out.println(winner2 + ", as paper covers rock");
            }
            if (input1.equalsIgnoreCase("Paper") && input2.equalsIgnoreCase("Spock")) {
                System.out.println(winner1 + ", as paper disproves spock");
            } else if (input2.equalsIgnoreCase("Paper") && input1.equalsIgnoreCase("Spock")) {
                System.out.println(winner2 + ", as paper disproves spock");
            }


            if (input1.equalsIgnoreCase("Scissors") && input2.equalsIgnoreCase("Paper")) {
                System.out.println(winner1 + ", as scissors cuts paper");
            } else if (input2.equalsIgnoreCase("Scissors") && input1.equalsIgnoreCase("Paper")) {
                System.out.println(winner2 + ", as scissors cuts paper");
            }
            if (input1.equalsIgnoreCase("Scissors") && input2.equalsIgnoreCase("Lizard")) {
                System.out.println(winner1 + ", as scissors decapitates lizard");
            } else if (input2.equalsIgnoreCase("Scissors") && input1.equalsIgnoreCase("Lizard")) {
                System.out.println(winner2 + ", as scissors decapitates lizard");
            }


            if (input1.equalsIgnoreCase("Spock") && input2.equalsIgnoreCase("Scissors")) {
                System.out.println(winner1 + ", as spock smashes scissors");
            } else if (input2.equalsIgnoreCase("Spock") && input1.equalsIgnoreCase("Scissors")) {
                System.out.println(winner2 + ", as spock smashes scissors");
            }
            if (input1.equalsIgnoreCase("Spock") && input2.equalsIgnoreCase("Rock")) {
                System.out.println(winner1 + ", as spock vaporizes rock");
            } else if (input2.equalsIgnoreCase("Spock") && input1.equalsIgnoreCase("Rock")) {
                System.out.println(winner2 + ", as spock vaporizes rock");
            }


            if (input1.equalsIgnoreCase("Lizard") && input2.equalsIgnoreCase("Paper")) {
                System.out.println(winner1 + ", as lizard eats paper");
            } else if (input2.equalsIgnoreCase("Lizard") && input1.equalsIgnoreCase("Paper")) {
                System.out.println(winner2 + ", as lizard eats paper");
            }
            if (input1.equalsIgnoreCase("Lizard") && input2.equalsIgnoreCase("Spock")) {
                System.out.println(winner1 + ", as lizard poisons spock");
            } else if (input2.equalsIgnoreCase("Lizard") && input1.equalsIgnoreCase("Spock")) {
                System.out.println(winner2 + ", as lizard poisons spock");
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
