import java.util.Scanner;

/**
 * Created by Jack on 10/13/15.
 */
public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the name of the animal");
        String animalName = scanner.nextLine();
        Animal animal = createAnimal(animalName);
        System.out.println(String.format("Created %s!", animal));



    }//Main method

    static Animal createAnimal (String animalName) {  //Factory Method
        Animal animal;
        switch (animalName) {
            case "snake":
                animal = new Snake();
                break;
            case "lion":
                animal = new Lion();
                break;
            case "condor":
                animal = new Condor();
                break;
            case "alligator":
                animal = new Reptile() {
                    @Override
                    public String toString() {
                        return "Alligator";
                    }
                };
                break;
            default:
                animal = new Animal();
        }
        return animal;

    }//Static method createAnimal
}
