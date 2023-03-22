package OOP.Inheritance;

class Vehicle{
    protected String brand;
    public void hank(){
        System.out.println("Tu tu");
        System.out.println("Brand: " + brand);
    }
}
class Bike extends Vehicle{
    public void hank (){
        System.out.println("Bip Bip");
        System.out.println("Brand: " + brand);
    }

}


public class Vehicleexample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Tesla";
        vehicle.hank();

        Bike bike = new Bike();
        bike.brand = "Cube";
        bike.hank();
    }
}
