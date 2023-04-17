package homeworks.HW17;

import OOP.Car;

import java.util.Scanner;
public class CallingVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter fuel amount in your vehicle");
        float fuel = scanner.nextFloat();

        System.out.println("Please enter vehicle's fuel usage per 100km");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Please enter passengers");
        int passengers = scanner.nextInt();

        Vehicle vehicle = new Vehicle(fuel, fuelUsage, passengers);
        vehicle.maxDistance();

        System.out.println("Will your A/C will be turned on? y/n");
        char input = scanner.next().toLowerCase().charAt(0);
        boolean airConditionerOn = true;
        if (input == 'y'){
            airConditionerOn = true;
        }

        Car1 car1 = new Car1(fuel,fuelUsage,passengers, airConditionerOn);
        car1.maxDistance();
        }

    }

