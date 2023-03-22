package homeworks;

import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter original price");
        float originalPrice = scanner.nextFloat();

        System.out.println("Please enter discount");
        float discount = scanner.nextFloat();


        float finalPrice = originalPrice - (originalPrice * discount / 100);
        System.out.printf("Price after the discount is %.2f ",finalPrice);



        //Discount method
    }
}
