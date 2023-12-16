public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        WildAnimal dog = new WildAnimal("Hugo", "Labrador", 5);
        dog.displayInfo();

        WildAnimal parrot = new WildAnimal("Kluvik", "Wavy", 200);
        parrot.displayInfo();

        WildAnimal cat = new WildAnimal("Barsik", "Asian", 8);
        cat.displayInfo();

        WildAnimal monkey = new WildAnimal("Goga", "Orangutan", 19);
        monkey.displayInfo();

        ZooAnimal bear = new ZooAnimal("Riddik", "Brown", 15, 1);
        bear.displayInfo();
        bear.displayID();

        ZooAnimal dragon = new ZooAnimal("Garold", "Golden", 36, 2);
        dragon.displayInfo();
        dragon.displayID();

        dragon.displayCount();

        System.out.println();
        Animal.counter++;
        System.out.println(Animal.counter);
    }
}
