package homeworks;

import java.util.Scanner;

public class my {
    public static void main(String[] args) {
        /*     Write an application, that will read two numbers from user
        (of type int) and will print true, if both numbers are the
        same sign (both are positive, or both are negative), or false
        otherwise.

        If at least one of given numbers is equal to 0, your application
        should print false.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = scanner.nextInt();

        System.out.println("Please enter second number");
        int num2 = scanner.nextInt();

        int intValue = num1 = num2;
        boolean boolValue;

        if((num1 >= 1 && num2 >= 1) || (num1 < 1 && num2 < 1)){
            boolValue = true;
        } else {
            boolValue = false;
        }
        System.out.println(boolValue);

    }
}
