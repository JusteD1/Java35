package homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        // Create a JAVA program that allows you to enter a size of an array (type int). Then ask user to enter each element one by one.
        // int [] arraySize = {scanner.nextInt()};

        Scanner scanner = new Scanner(System.in);
        //int array [] = new Integer[]{};
        int score = 0;

        System.out.println("Please enter a required size of the array");
        int arraySize = scanner.nextInt();
        //Integer [] arraySize = new Integer[]{scanner.nextInt()};


        //i- row
        //j- column
        for(int i = 0; i < 1; i++){
            System.out.print("Enter elements of the array one by one");
            System.out.println();
            } for(int i= 1; i<= arraySize; i++){
            System.out.println("Please enter element number: "+ i );
            int element = scanner.nextInt();
            }

        }
        //System.out.println("Source array: " + array.length);
        //System.out.println("Source array: " + number []{scanner.nextInt()});
        }


















