package OOP;

public class CallingAnimalClass {
    public static void main(String[] args) {
        //Creating new animal class object
        Animal dog = new Animal("Buldog", 15, 4.6d);
        dog.printAnimalInfo();

        Animal cat = new Animal("Persian", 18, 5.6d);
        cat.printAnimalInfo();

        Animal hamster = new Animal("Hamster", 4);
        hamster.printAnimalInfo();

        Animal dog2 = new Animal();
        dog2.printAnimalInfo();

        }
    }

