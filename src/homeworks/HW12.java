package homeworks;

import java.util.Scanner;

import static java.lang.String.*;
import static java.lang.String.valueOf;

public class HW12 {
    public static void main(String[] args) {

        //Palindrome

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a palindrome");

        String palindrome = scanner.nextLine().trim();
        String revPalindrome = "";
        int palindromeLenght = palindrome.length();

        for (int i = (palindromeLenght -1 ); i >= 0; --i ){
            revPalindrome = revPalindrome + palindrome.charAt(i);

        }
        if (palindrome.toLowerCase().equals(revPalindrome.toLowerCase())){
            System.out.println(palindrome + " is a palindrome");

        }else{
            System.out.println(palindrome + " is not a palindrome");

        }



    }


}
