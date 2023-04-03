package homeworks.HW17;

import java.util.Scanner;

public class Car1 extends Vehicle {
    //Scanner scanner = new Scanner(System.in);
    //char turnOn = 'y';

    private boolean airConditioner;

    public Car1(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    public void maxDistance() {
        if (!airConditioner) {
            maxDistance();
        } else {
            float input = (float) ((1+ 0.05 * getPassengers()) * 0.1);
            float maxDistance=  getFuel()/(getFuelUsage()* input) *100;
            System.out.println("Your vehicle can drive maximum " + String.format("%.2f",maxDistance));
        }

    }


}