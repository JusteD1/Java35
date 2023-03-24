package homeworks;

import java.util.Scanner;

public class HW15my {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }

    public static String rockPaperScissors(String player1, String player2) {
        //String input1 = "Rock" + "Paper" + "Scissors";
        //String input2 = "Rock" + "Paper" + "Scissors";

        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        String rock = new String("Rock");
        String paper = new String("Paper");
        String scissors = new String("Scissors");
        String winner = "No winner";
        String finalresult = "";

        if (input1.equalsIgnoreCase("Rock") || input1.equalsIgnoreCase("Paper") || input1.equalsIgnoreCase("Scissors")) {

        } else if (input2.equalsIgnoreCase("Rock") || input2.equalsIgnoreCase("Paper") || input2.equalsIgnoreCase("Scissors")) {

        } else {
            System.out.println("Input is invalid");
        }


        System.out.println(input1.equalsIgnoreCase("Rock") || input1.equalsIgnoreCase("Paper") || input1.equalsIgnoreCase("Scissors"));
        System.out.println(input2.equalsIgnoreCase("Rock") || input2.equalsIgnoreCase("Paper") || input2.equalsIgnoreCase("Scissors"));


        if (input1.equalsIgnoreCase("Rock") && input2.equalsIgnoreCase("Paper")) {
            System.out.println(winner + "Player 2, as paper covers rock");
        } else if (input2.equalsIgnoreCase("Rock") && input1.equalsIgnoreCase("Paper")) {
            System.out.println(winner + "Player 1, as paper covers rock");
        }

        if(input1.equalsIgnoreCase("Paper") && input2.equalsIgnoreCase("Scissors")){
            System.out.println(winner + "Player 2, as scissors cuts paper");
        } else if (input2.equalsIgnoreCase("Paper") && input1.equalsIgnoreCase("Scissors")) {
            System.out.println(winner + "Player 1, as scissors cuts paper");
        }

        if(input1.equalsIgnoreCase("Scissors") && input2.equalsIgnoreCase("Rock")){
            System.out.println(winner + "Player 2, as rock smashes scissors");
        } else if (input2.equalsIgnoreCase("Scissors") && input1.equalsIgnoreCase("Rock")) {
            System.out.println(winner + "Player 1, as rock smashes scissors");
        }




        return finalresult;


        //


    }
}

