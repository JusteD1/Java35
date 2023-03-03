package homeworks;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        /*     Write an application, that will read two numbers from user
        (of type int) and will print true, if both numbers are the
        same sign (both are positive, or both are negative), or false
        otherwise.

        If at least one of given numbers is equal to 0, your application
        should print false.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int number1 = scanner.nextInt();

        System.out.println("Please enter second number");
        int number2 = scanner.nextInt();

        boolean value1 = number1 > 0;
        boolean value2 = number1 < 0;
        boolean value3 = number2 > 0;
        boolean value4 = number2 < 0;
        boolean boolValue;

        if ((value1 && value3) || (value4 && value2)) {
            boolValue = true;
        } else {
            boolValue = false;
        }
        System.out.println(boolValue);
    }
    }

