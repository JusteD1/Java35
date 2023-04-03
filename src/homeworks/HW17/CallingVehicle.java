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



        System.out.println("Will you turn on air conditioner? y/n");
        //System.out.println("Will you turn on A/C?true/false");
        boolean airConditioner = true;
        airConditioner = scanner.nextBoolean();
        //char turnOn = 'y';

        Car1 car1 = new Car1(fuel,fuelUsage,passengers, airConditioner);
        car1.maxDistance();

        /*turnOn = scanner.next().charAt(0);
        while (turnOn == 'y'){
            car1.maxDistance();
            break;
        }*/

        }

    }

