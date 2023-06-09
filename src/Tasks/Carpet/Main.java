package Tasks.Carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter floor lenght");
        double lenght = scanner.nextDouble();

        System.out.println("Please enter floor width");
        double width = scanner.nextDouble();

        //Create Floor object
        Floor floor = new Floor(lenght, width);

        System.out.println("Floor m^2: " + floor.getArea());

        System.out.println("Please enter carpet price per m^2");
        double carpetCost = scanner.nextDouble();

        //Create carpet class object
        Carpet carpet = new Carpet(carpetCost);

        System.out.println("Carpet price per m^2: " + carpet.getCost());

        //Create Calculator class object
        //and pass Floor and Carpet class object as input

        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("in total Carpet will cost " + calculator.getTotalCost() + " Eur");



    }
}
