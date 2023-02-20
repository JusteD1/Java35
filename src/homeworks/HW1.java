package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        // Using scanner ask user to enter name and year of birth
        // Input:
        //      John, 2000
        // Print out:
        //      "Your name is John and you are 22 years old"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("Please enter your year of birth");
        int birthYear = scanner.nextInt();
        int year = 2023;

        System.out.println("Your name is " + name + " and you are " + Math.abs(birthYear - year));


    }
}
