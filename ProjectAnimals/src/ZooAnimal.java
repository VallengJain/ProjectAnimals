class ZooAnimal extends Animal {
    private int id = 0;

    public ZooAnimal(String name, String type, int age, int id) {
        super(name, type, age);
        this.setID(id);
    }

    public void setID(int id) {
        this.id = id;
    }

    void displayID() {
        System.out.printf("ID for %s is %s.\n", this.name, this.id);
    }
}