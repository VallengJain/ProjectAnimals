public abstract class Animal {
    private String name;
    private String type;
    private int age;
    private static int counter;

    public Animal(String name, String type, int age) {
        this.setName(name);
        this.setType(type);
        this.setAge(age);
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        if (age > 0 && age < 51) {
            this.age = age;
        } else {
            this.age = age;
            System.out.printf("\nIncorrect age indication for %s!", this.name);
        }

    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getAge() {
        return this.age;
    }

    public void displayInfo() {
        System.out.printf("\nName: %s \tType: %s \tAge: %d", this.name, this.type, this.age);
    }

    public static void displayCount() {
        System.out.printf("\nQuantity of Animals: %s.\n", counter);
    }
}