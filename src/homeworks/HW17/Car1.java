package homeworks.HW17;

import java.util.Scanner;

public class Car1 extends Vehicle {
    private boolean airConditionerOn;

    public Car1(float fuel, float fuelUsage, int passengers, boolean airConditionerOn) {
        super(fuel, fuelUsage, passengers);
        this.airConditionerOn = airConditionerOn;
    }
    public void maxDistance() {
        if (airConditionerOn) {
            float input = (float) (1 + 0.05 * getPassengers());
            float newMaxDistance = (float) (getFuel() / (getFuelUsage() * (input *1.1)) * 100);
            System.out.println("Your vehicle can drive maximum " + String.format("%.2f", newMaxDistance));
        } else {
            float input = (float) (1+ 0.05 * getPassengers());
            float maxDistance = getFuel()/(getFuelUsage()* input) * 100;
            System.out.println("Your vehicle can drive maximum " + String.format("%.2f", maxDistance));
        }


    }
}



