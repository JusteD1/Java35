package homeworks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {
        //Personal code

        /*Create a JAVA program that allows you to enter Personal Number (Example 112233-
        12345) as a String value and you should get output if this input is following right
        pattern (exactly 6 any numbers followed by exactly one “-” and then exactly 5 more
        any numbers). Don’t worry about other limitations like month in personal code, just
        look for this pattern. */

        Scanner scanner = new Scanner(System.in);
        char again = 'y';

        System.out.println("Please enter your personal number");
        String personalNo = scanner.nextLine();

        if (Pattern.matches("[0-9]{6}-[0-9]{5}", personalNo)) {
            System.out.println("Your personal number is valid");
                } else {
                    System.out.println("Your personal number is not valid");
                }

                while (again == 'y') {


                    System.out.println("You are in a while loop");

                    System.out.println("Do you want to enter your personal number again? y/n");
                    again = scanner.next().charAt(0);

                    String test = scanner.nextLine();
                    //Fixing problem
                    scanner.nextLine();
                }



            }
        }


