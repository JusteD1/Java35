package homeworks;

import java.util.Arrays;
import java.util.Scanner;


/* Use the same functionality from previous task (change array type to float) and create
array. Sum all elements in the array and calculate average grade.  */

public class HW8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a required size of the array");
        int arraySize = scanner.nextInt();
        float [] grade = new float[arraySize];
        int sum = 0;

        System.out.println("Enter the grades of the array one by one");

        for(int i = 0; i< arraySize; i++){
            System.out.println("Please enter grade number: "+ (i+1));
            grade[i] = scanner.nextInt();
            sum += grade[i];
        }

        System.out.println("Average grade: " + (float)sum/arraySize);
        System.out.println("There was passed : "+ arraySize + " values");





    }
}
