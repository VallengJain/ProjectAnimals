public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Object dog = new WildAnimal("Hugo", "Labrador", 5, "Fir forest");
        if(dog instanceof ZooAnimal) {
            ZooAnimal ZooAnimalDog = (ZooAnimal) dog;
            ZooAnimalDog.displayInfo();
        } else {
            System.out.println("Conversion is invalid.");
        }

        WildAnimal parrot = new WildAnimal("Kluvik", "Wavy", 200, "Tropical forest");
        parrot.displayInfo();

        WildAnimal cat = new WildAnimal("Barsik", "Asian", 8, "Tropical forest");
        cat.displayInfo();

        WildAnimal monkey = new WildAnimal("Goga", "Orangutan", 19, "South forest");
        monkey.displayInfo();



        ZooAnimal bear = new ZooAnimal("Riddik", "Brown", 15, 1);
        bear.displayInfo();
        bear.displayID();

        ZooAnimal dragon = new ZooAnimal("Garold", "Golden", 36, 2);
        dragon.displayInfo();
        dragon.displayID();



        Animal.displayCount();
    }
}
