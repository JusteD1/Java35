package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        // Create a JAVA program that allows you to enter a size of an array (type int). Then ask user to enter each element one by one.
        // int [] arraySize = {scanner.nextInt()};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a required size of the array");
        int arraySize = scanner.nextInt();
        int [] numbers = new int [arraySize];
        int sum = 0;

        System.out.println("Enter elements of the array one by one");
        //i- row
        //j- column
        for(int i = 0; i< arraySize; i++){
            System.out.println("Please enter element number: "+ (i+1));
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            }

        System.out.println("Source array: " + Arrays.toString(numbers));
        System.out.println("Sum: "+ sum);



    }

        }



















