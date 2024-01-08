class ZooAnimal extends Animal {
    private int id = 0;

    public ZooAnimal(String name, String type, int age, int id) {
        super(name, type, age);
        this.setID(id);
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.printf(", \tID in zoo: %d.\n", this.id);
    }
}