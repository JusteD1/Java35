package OOP.Abstraction;


//Abstract class
abstract class Animal{
    protected String name;
    //Regular method
    public void sleep(){
        System.out.println("Zzz");
    }
    //Abstract method
    public abstract void animalSound();
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Oink oink");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        //Cannot create an object from abstract class
        //Animal animal = new Animal();

        Pig pig = new Pig();
        pig.sleep();
        pig.animalSound();
            }
        }



