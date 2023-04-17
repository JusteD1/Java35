package homeworks.HW17;

public class Vehicle {
        private float fuel;
        private float fuelUsage;
        private int passengers;

    //Constructor
    public Vehicle(float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
        }

        //Setter method
    public void setFuel(float fuel) {
        this.fuel = fuel;
    }
    public void setFuelUsage(float fuelUsage) {
        this.fuelUsage = fuelUsage;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    //Getter method
    public float getFuel() {
        return fuel;
    }
    public float getFuelUsage() {
        return fuelUsage;
    }

    public int getPassengers() {
        return passengers;
    }

    public void maxDistance(){
        float input = (float) (1+ 0.05 * passengers);
        float maxDistance=  fuel/(fuelUsage * input)*100;

        //System.out.println("Your vehicle can drive maximum " + String.format("%.2f",maxDistance));

        }


        }

