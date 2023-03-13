package homeworks;

import java.util.Arrays;


public class HW10 {
    public static void main(String[] args) {



        /*Write a Java program to reverse an array of integer values.
        Create an array (int type) put some random values in array and print out all
        elements.
       Use for loop to iterate through array and switch places with first and last
        element and then second from beginning and second from end etc. with rest
        of the elements
       Print out array elements using Arrays.toString() method
         */

        String[] elements = new String[13];

        int[] myArray = {1, 2, 3, 4, 5, 6, 20, 7, 8, 9, 10, 11, 12};
        System.out.println("Original array: " + Arrays.toString(myArray));

        StringBuilder reversed = new StringBuilder();

        for(int i = myArray.length;i > 0; i--){
            reversed.append(myArray[i-1] + " ");
        }
        String [] reversedArray = reversed.toString().split(" ");
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));


        }



    }









