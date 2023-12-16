public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Animal dog = new Animal("Hugo", "Labrador", 5);
        dog.displayInfo();

        Animal parrot = new Animal("Kluvik", "Wavy", 200);
        parrot.displayInfo();

        Animal cat = new Animal("Barsik", "Asian", 8);
        cat.displayInfo();

        Animal monkey = new Animal("Goga", "Orangutan", 19);
        monkey.displayInfo();

        ZooAnimal bear = new ZooAnimal("Riddik", "Brown", 15, 1);
        bear.displayInfo();
        bear.displayID();

        ZooAnimal dragon = new ZooAnimal("Garold", "Golden", 36, 2);
        dragon.displayInfo();
        dragon.displayID();

        dragon.displayCount();
        Animal.counter++;
        System.out.println(Animal.counter);
    }
}
